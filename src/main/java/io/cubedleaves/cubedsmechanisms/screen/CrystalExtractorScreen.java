package io.cubedleaves.cubedsmechanisms.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import io.cubedleaves.cubedsmechanisms.CubedsMechanisms;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class CrystalExtractorScreen extends AbstractContainerScreen<CrystalExtractorMenu> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(CubedsMechanisms.MOD_ID,"textures/gui/crystal_extractor_gui.png");
    public CrystalExtractorScreen(CrystalExtractorMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(PoseStack stack, float partialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(stack, x, y, 0, 0, imageWidth, imageHeight);
        renderProgressArrow(stack, x, y);
    }




    private void renderProgressArrow(PoseStack pPoseStack, int x, int y) {
        if(menu.isCrafting()) {
            blit(pPoseStack, x + 86, y + 31, 176, 0, 8, menu.getScaledProgress());
        }
    }

    @Override
    public void render(PoseStack stack, int mouseX, int mouseY, float delta) {
        renderBackground(stack);
        super.render(stack, mouseX, mouseY, delta);
        renderTooltip(stack, mouseX, mouseY);
    }
}
