package io.cubedleaves.cubedsmechanisms.Init.entity;

import io.cubedleaves.cubedsmechanisms.CubedsMechanisms;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import io.cubedleaves.cubedsmechanisms.Init.blockinit;

public class BlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CubedsMechanisms.MOD_ID);

    public static final RegistryObject<BlockEntityType<CrystalExtractorBlockEntity>> CRYSTAL_EXTRACTOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("crystal_extractor_block_entity", () -> BlockEntityType.Builder.of(CrystalExtractorBlockEntity::new, blockinit.CRYSTAL_EXTRACTOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
