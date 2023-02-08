package io.cubedleaves.cubedsmechanisms.Init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class creativeTab {
    public static final CreativeModeTab TAB_SIMPLE_MACHINES_RESOURCES = new CreativeModeTab("simple_machines_resources_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(iteminit.ELECTRO_GEODE.get());
        }
    };
    public static final CreativeModeTab TAB_SIMPLE_MACHINES_UNOBTAINABLE = new CreativeModeTab("simple_machines_unobtainable_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(iteminit.INFINITY_CRYSTAL.get());
        }
    };
    public static final CreativeModeTab TAB_SIMPLE_MACHINES_MISC = new CreativeModeTab("simple_machines_misc_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(blockinit.EXPERIENCE_ORE.get());
        }
    };
    public static final CreativeModeTab TAB_SIMPLE_MACHINES_BLOCKS = new CreativeModeTab("simple_machines_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(blockinit.CRYSTAL_GENERATOR.get());
        }
    };


}
