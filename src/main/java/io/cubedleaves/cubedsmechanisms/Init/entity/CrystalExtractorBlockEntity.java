package io.cubedleaves.cubedsmechanisms.Init.entity;

import io.cubedleaves.cubedsmechanisms.Init.iteminit;
import io.cubedleaves.cubedsmechanisms.screen.CrystalExtractorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CrystalExtractorBlockEntity extends BlockEntity implements MenuProvider {

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;


    public final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();



    public CrystalExtractorBlockEntity( BlockPos blockPos, BlockState blockState) {
        super(BlockEntities.CRYSTAL_EXTRACTOR_BLOCK_ENTITY.get(), blockPos, blockState);

        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> CrystalExtractorBlockEntity.this.progress;
                    case 1 -> CrystalExtractorBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
               switch (index) {
                   case 0 -> CrystalExtractorBlockEntity.this.progress = value;
                   case 1 -> CrystalExtractorBlockEntity.this.maxProgress = value;
               }
            }

            @Override
            public int getCount() {
                return 0;
            }
        };
    }


    @Override
    public Component getDisplayName() {
        return Component.literal("Crystal Extractor");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new CrystalExtractorMenu(id, inventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {

        nbt.put("inventory", itemHandler.serializeNBT());

        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos blockPos, BlockState blockState, CrystalExtractorBlockEntity pEntity) {
        if (level.isClientSide()) {
            return;
        }

        if(hasRecipe(pEntity)) {
            pEntity.progress++;
            setChanged(level, blockPos, blockState);
            if(pEntity.progress >= pEntity.maxProgress) {
                craftItem(pEntity);
            }
        }else {
            pEntity.resetProgress();
            setChanged(level, blockPos, blockState);

        }

    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(CrystalExtractorBlockEntity pEntity) {
        if (hasRecipe(pEntity)) {
            pEntity.itemHandler.extractItem(1, 1, false);
            pEntity.itemHandler.setStackInSlot(2, new ItemStack(iteminit.ELECTRO_CRYSTAL.get(), pEntity.itemHandler.getStackInSlot(2).getCount() + 1));
            pEntity.resetProgress();
        }
    }

    /* This code "Block" adds a hard codded recipe, add recipes using json files in projectpath/src/main/resources/data/projectname/recipes/recipename.json
    {
        "type": "cubedsmachines:extract_crystal"
        "geode": "modid:itemid"
        "result": "modid:itemid"
        "time": "50"
        "energy": "100"
     }
     the time is how many ticks it takes, and energy is how energy it requires. Geode is the item geode, and result is what the crystal is.
     */
    private static boolean hasRecipe(CrystalExtractorBlockEntity entity) {
            SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
            for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
                inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
            }

            boolean hasElectroGeodeInFirstSlot = entity.itemHandler.getStackInSlot(1).getItem() == iteminit.ELECTRO_GEODE.get();

            return hasElectroGeodeInFirstSlot && canInsertAmmountIntoItemSlot(inventory) && canInsertItemIntoOutputSlot(inventory, new ItemStack(iteminit.ELECTRO_CRYSTAL.get(), 1));
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack itemStack) {
        return inventory.getItem(2).getItem() == itemStack.getItem() || inventory.getItem(2).isEmpty();
    }

    private static boolean canInsertAmmountIntoItemSlot(SimpleContainer inventory) {
        return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount();
    }

}
