package io.cubedleaves.cubedsmechanisms;

import com.mojang.logging.LogUtils;
import io.cubedleaves.cubedsmechanisms.Init.entity.BlockEntities;
import io.cubedleaves.cubedsmechanisms.fluid.BaseFluidType;
import io.cubedleaves.cubedsmechanisms.fluid.FluidTypes;
import io.cubedleaves.cubedsmechanisms.fluid.Fluids;
import io.cubedleaves.cubedsmechanisms.screen.CrystalExtractorScreen;
import io.cubedleaves.cubedsmechanisms.screen.MenuTypes;
import io.cubedleaves.cubedsmechanisms.world.feature.ModConfiguredFeatures;
import io.cubedleaves.cubedsmechanisms.world.feature.ModPlacedFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import io.cubedleaves.cubedsmechanisms.Init.iteminit;
import io.cubedleaves.cubedsmechanisms.Init.blockinit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CubedsMechanisms.MOD_ID)
public class CubedsMechanisms
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "cubedsmechanisms";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public CubedsMechanisms()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        iteminit.register(modEventBus);
        blockinit.register(modEventBus);


        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        Fluids.register(modEventBus);
        FluidTypes.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        BlockEntities.register(modEventBus);
        MenuTypes.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(Fluids.LIQUID_ENERGY_SOURCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(Fluids.FLOWING_LIQUID_ENERGY.get(), RenderType.translucent());

            MenuScreens.register(MenuTypes.CRYSTAL_EXTRACTOR_MENU.get(), CrystalExtractorScreen::new);
        }
    }
}
