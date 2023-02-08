package io.cubedleaves.cubedsmechanisms.world.feature;

import io.cubedleaves.cubedsmechanisms.CubedsMechanisms;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, CubedsMechanisms.MOD_ID);

    public static final RegistryObject<PlacedFeature> ELECTRO_ORE_PLACED = PLACED_FEATURES.register("electro_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ELECTRO_ORE.getHolder().get(),
                    commonOrePlacement(4, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(25)))));

    public static final RegistryObject<PlacedFeature> END_ELECTRO_ORE_PLACED = PLACED_FEATURES.register("end_electro_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_ELECTRO_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_ELECTRO_ORE_PLACED = PLACED_FEATURES.register("nether_electro_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_ELECTRO_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(32)))));

    public static final RegistryObject<PlacedFeature> ENERGONIC_ORE_PLACED = PLACED_FEATURES.register("energonic_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ENERGONIC_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(35)))));

    public static final RegistryObject<PlacedFeature> END_ENERGONIC_ORE_PLACED = PLACED_FEATURES.register("end_energonic_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_ENERGONIC_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_ENERGONIC_ORE_PLACED = PLACED_FEATURES.register("nether_energonic_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_ENERGONIC_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk

                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(42)))));

    public static final RegistryObject<PlacedFeature> CRYOGENIC_ORE_PLACED = PLACED_FEATURES.register("cryogenic_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CRYOGENIC_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> END_CRYOGENIC_ORE_PLACED = PLACED_FEATURES.register("end_cryogenic_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_CRYOGENIC_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_CRYOGENIC_ORE_PLACED = PLACED_FEATURES.register("nether_cryogenic_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_CRYOGENIC_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(87)))));
    public static final RegistryObject<PlacedFeature> IRIDIUM_ORE_PLACED = PLACED_FEATURES.register("iridium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.IRIDIUM_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(70)))));

    public static final RegistryObject<PlacedFeature> END_IRIDIUM_ORE_PLACED = PLACED_FEATURES.register("end_iridium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_IRIDIUM_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_IRIDIUM_ORE_PLACED = PLACED_FEATURES.register("nether_iridium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_IRIDIUM_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(77)))));
    public static final RegistryObject<PlacedFeature> HEATED_ORE_PLACED = PLACED_FEATURES.register("heated_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.HEATED_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(55)))));

    public static final RegistryObject<PlacedFeature> END_HEATED_ORE_PLACED = PLACED_FEATURES.register("end_heated_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_HEATED_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_HEATED_ORE_PLACED = PLACED_FEATURES.register("nether_heated_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_HEATED_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(52)))));

    public static final RegistryObject<PlacedFeature> EXPERIENCE_ORE_PLACED = PLACED_FEATURES.register("experience_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.EXPERIENCE_ORE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(320)))));

    public static final RegistryObject<PlacedFeature> END_EXPERIENCE_ORE_PLACED = PLACED_FEATURES.register("end_experience_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_EXPERIENCE_ORE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(320)))));

    public static final RegistryObject<PlacedFeature> NETHER_EXPERIENCE_ORE_PLACED = PLACED_FEATURES.register("nether_experience_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_EXPERIENCE_ORE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(320)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
