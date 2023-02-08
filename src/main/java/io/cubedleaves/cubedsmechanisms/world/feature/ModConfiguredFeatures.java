package io.cubedleaves.cubedsmechanisms.world.feature;

import com.google.common.base.Suppliers;
import io.cubedleaves.cubedsmechanisms.CubedsMechanisms;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import io.cubedleaves.cubedsmechanisms.Init.blockinit;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, CubedsMechanisms.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ELECTRO_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockinit.ELECTRO_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, blockinit.DEEPSLATE_ELECTRO_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ENERGONIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockinit.ENERGONIC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, blockinit.DEEPSLATE_ENERGONIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_EXPERIENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockinit.EXPERIENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, blockinit.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_HEATED_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockinit.HEATED_ORE.get().defaultBlockState()),
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, blockinit.DEEPSLATE_HEATED_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_IRIDIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockinit.IRIDIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, blockinit.DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRYOGENIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockinit.CRYOGENIC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, blockinit.DEEPSLATE_CRYOGENIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ENERGONIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, blockinit.NETHER_ENERGONIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ELECTRO_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, blockinit.NETHER_ELECTRO_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_CRYOGENIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, blockinit.NETHER_CRYOGENIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_IRIDIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, blockinit.NETHER_IRIDIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_HEATED_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, blockinit.NETHER_HEATED_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_EXPERIENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, blockinit.NETHER_EXPERIENCE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_EXPERIENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), blockinit.END_EXPERIENCE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ELECTRO_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), blockinit.END_ELECTRO_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ENERGONIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), blockinit.END_ENERGONIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_IRIDIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), blockinit.END_IRIDIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_HEATED_ORES = Suppliers.memoize(() -> List.of(
        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), blockinit.END_HEATED_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_CRYOGENIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), blockinit.END_CRYOGENIC_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?,?>> ELECTRO_ORE = CONFIGURED_FEATURE.register("electro_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ELECTRO_ORES.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?,?>> NETHER_ELECTRO_ORE = CONFIGURED_FEATURE.register("nether_electro_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ELECTRO_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> END_ELECTRO_ORE = CONFIGURED_FEATURE.register("end_electro_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ELECTRO_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> ENERGONIC_ORE = CONFIGURED_FEATURE.register("energonic_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ENERGONIC_ORES.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?,?>> NETHER_ENERGONIC_ORE = CONFIGURED_FEATURE.register("nether_energonic_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ENERGONIC_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> END_ENERGONIC_ORE = CONFIGURED_FEATURE.register("end_energonic_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ENERGONIC_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> CRYOGENIC_ORE = CONFIGURED_FEATURE.register("cryogenic_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CRYOGENIC_ORES.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?,?>> NETHER_CRYOGENIC_ORE = CONFIGURED_FEATURE.register("nether_cryogenic_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_CRYOGENIC_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> END_CRYOGENIC_ORE = CONFIGURED_FEATURE.register("end_cryogenic_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_CRYOGENIC_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> IRIDIUM_ORE = CONFIGURED_FEATURE.register("iridium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_IRIDIUM_ORES.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?,?>> NETHER_IRIDIUM_ORE = CONFIGURED_FEATURE.register("nether_iridium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_IRIDIUM_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> END_IRIDIUM_ORE = CONFIGURED_FEATURE.register("end_iridium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_IRIDIUM_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> HEATED_ORE = CONFIGURED_FEATURE.register("heated_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_HEATED_ORES.get(),5)));
    public static final RegistryObject<ConfiguredFeature<?,?>> NETHER_HEATED_ORE = CONFIGURED_FEATURE.register("nether_heated_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_HEATED_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> END_HEATED_ORE = CONFIGURED_FEATURE.register("end_heated_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_HEATED_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?,?>> EXPERIENCE_ORE = CONFIGURED_FEATURE.register("experience_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_EXPERIENCE_ORES.get(),4)));
    public static final RegistryObject<ConfiguredFeature<?,?>> NETHER_EXPERIENCE_ORE = CONFIGURED_FEATURE.register("nether_experience_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_EXPERIENCE_ORES.get(),6)));
    public static final RegistryObject<ConfiguredFeature<?,?>> END_EXPERIENCE_ORE = CONFIGURED_FEATURE.register("end_experience_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_EXPERIENCE_ORES.get(),6)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURE.register(eventBus);
    }
}
