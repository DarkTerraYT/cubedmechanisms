package io.cubedleaves.simplemeckanisms.Init;

import io.cubedleaves.simplemeckanisms.SimpleMeckanisms;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class blockinit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleMeckanisms.MOD_ID);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return  toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {


        return  iteminit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static final RegistryObject<Block> ELECTRO_ORE = registerBlock("electro_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(5,13)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> DEEPSTATE_ELECTRO_ORE = registerBlock("deepslate_electro_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> ELECTRO_BLOCK = registerBlock("electro_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> INFUSED_ELECTRO_BLOCK = registerBlock("infused_electro_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> CRYOGENIC_ORE = registerBlock("cryogenic_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> IRIDIUM_ORE = registerBlock("iridium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> ENERGONIC_ORE = registerBlock("energonic_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> DEEPSLATE_CRYOGENIC_ORE = registerBlock("deepslate_cryogenic_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> DEEPSLATE_IRIDIUM_ORE = registerBlock("deepslate_iridium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> DEEPSLATE_ENERGONIC_ORE = registerBlock("deepslate_energonic_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> CRYOGENIC_BLOCK = registerBlock("cryogenic_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> IRIDIUM_BLOCK = registerBlock("iridium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> ENERGONIC_BLOCK = registerBlock("energonic_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> SUPER_HEATED_BLOCK = registerBlock("super_heated_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> DEEPSLATE_HEATED_ORE = registerBlock("deepslate_heated_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> HEATED_ORE = registerBlock("heated_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(2,10)), creativeTab.TAB_SIMPLE_MACHINES_RESOURCES);
    public static final RegistryObject<Block> EXPERIENCE_ORE = registerBlock("experience_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(1,500)), creativeTab.TAB_SIMPLE_MACHINES_MISC);
    public static final RegistryObject<Block> DEEPSLATE_EXPERIENCE_ORE = registerBlock("deepslate_experience_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(1,500)), creativeTab.TAB_SIMPLE_MACHINES_MISC);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
