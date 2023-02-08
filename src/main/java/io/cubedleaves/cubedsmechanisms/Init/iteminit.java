package io.cubedleaves.cubedsmechanisms.Init;

import io.cubedleaves.cubedsmechanisms.Init.custom.item.InfinityCrystal;
import io.cubedleaves.cubedsmechanisms.CubedsMechanisms;
import io.cubedleaves.cubedsmechanisms.fluid.Fluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class iteminit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CubedsMechanisms.MOD_ID);

    public static final RegistryObject<Item> ELECTRO_GEODE = ITEMS.register("electro_geode", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> ELECTRO_CRYSTAL = ITEMS.register("electro_crystal", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> INFUSED_ELECTRO_CRYSTAL = ITEMS.register("infused_electro_crystal", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> CRYOGENIC_CRYSTAL = ITEMS.register("cryogenic_crystal", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> CRYOGENIC_GEODE = ITEMS.register("cryogenic_geode", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> IRIDIUM_CRYSTAL = ITEMS.register("iridium_crystal", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> IRIDIUM_GEODE = ITEMS.register("iridium_geode", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> SUPER_HEATED_CRYSTAL = ITEMS.register("super_heated_crystal", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> SUPER_HEATED_GEODE = ITEMS.register("super_heated_geode", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> ENERGONIC_CRYSTAL = ITEMS.register("energonic_crystal", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> ENERGONIC_GEODE = ITEMS.register("energonic_geode", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> PURIFIED_QUARTZ = ITEMS.register("purified_quartz", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));
    public static final RegistryObject<Item> INFINITY_CRYSTAL = ITEMS.register("infinity_crystal", () -> new InfinityCrystal(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_UNOBTAINABLE).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> PLACE_HOLDER_ITEM = ITEMS.register("place_holder", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_UNOBTAINABLE)));
    public static final RegistryObject<Item> LIQUID_ENERGY_BUCKET = ITEMS.register("liquid_energy_bucket", () -> new BucketItem(Fluids.LIQUID_ENERGY_SOURCE, new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> SOLIDIFIED_ENERGY = ITEMS.register("solidified_energy", () -> new Item(new Item.Properties().tab(creativeTab.TAB_SIMPLE_MACHINES_RESOURCES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
