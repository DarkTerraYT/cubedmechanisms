package io.cubedleaves.cubedsmechanisms.Init.custom.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrystalLamp extends Block {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");


    public CrystalLamp(Properties properties) {
        super(properties);
    }

@javax.annotation.Nullable
    public BlockState getStateForPlacement(BlockPlaceContext placeContext) {
        return this.defaultBlockState().setValue(LIT, Boolean.valueOf(placeContext.getLevel().hasNeighborSignal(placeContext.getClickedPos())));
    }

    public void neighborChanged(BlockState state, Level level, BlockPos blockPos, Block block, BlockPos pos, boolean b) {
        if (!level.isClientSide) {
            boolean flag = state.getValue(LIT);
            if (flag != level.hasNeighborSignal(blockPos)) {
                if (flag) {
                    level.scheduleTick(blockPos, this, 4);
                } else {
                    level.setBlock(blockPos, state.cycle(LIT), 2);
                }
            }

        }
    }
    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (blockState.getValue(LIT) && !serverLevel.hasNeighborSignal(blockPos)) {
            serverLevel.setBlock(blockPos, blockState.cycle(LIT), 2);
        }

    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(stack, getter, list, flag);
        list.add(Component.literal("Does Nothing Yet, Except Then Being a Better Redstone Lamp"));
    }
}
