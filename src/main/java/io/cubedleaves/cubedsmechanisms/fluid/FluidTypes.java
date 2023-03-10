package io.cubedleaves.cubedsmechanisms.fluid;

import com.mojang.math.Vector3f;
import io.cubedleaves.cubedsmechanisms.CubedsMechanisms;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class FluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation ENERGIZED_OVERLAY_RL = new ResourceLocation(CubedsMechanisms.MOD_ID, "misc/in_liquid_energy");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CubedsMechanisms.MOD_ID);

    public static final RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, ENERGIZED_OVERLAY_RL,
                0xA1FF0000, new Vector3f(255f / 255f, 0f / 255f, 0f / 255f), properties));
    }
    public static final RegistryObject<FluidType> LIQUID_ENERGY_FLUID_TYPE = register("liquid_energy_fluid_type", FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"), SoundEvents.GENERIC_DRINK));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
