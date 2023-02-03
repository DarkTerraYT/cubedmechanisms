package io.cubedleaves.cubedsmechanisms.Init.custom.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InfinityCrystal extends Item {
    public InfinityCrystal(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        var energy = "INF";
        if(Screen.hasShiftDown()) {
            components.add(Component.literal("Imbued With Infinity!").withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.DARK_PURPLE));
            components.add(Component.literal(""));
            components.add(Component.literal("Provides 100000000RF/tick to Crystal Generators").withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.YELLOW));
            components.add(Component.literal(energy+"/INF RF left").withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.RED));
        }
        else {
            components.add(Component.literal("Imbued With Infinity!").withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.DARK_PURPLE));
            components.add(Component.literal(""));
            components.add(Component.literal("Press SHIFT For More Info!").withStyle(ChatFormatting.YELLOW));
        }
        super.appendHoverText(stack, level, components, flag);
    }
}
