package io.cubedleaves.cubedsmechanisms.fluid;

import io.cubedleaves.cubedsmechanisms.CubedsMechanisms;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import io.cubedleaves.cubedsmechanisms.Init.blockinit;
import io.cubedleaves.cubedsmechanisms.Init.iteminit;

public class Fluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, CubedsMechanisms.MOD_ID);

    public static final RegistryObject<FlowingFluid> LIQUID_ENERGY_SOURCE = FLUIDS.register("liquid_energy_fluid", () -> new ForgeFlowingFluid.Source(Fluids.LIQUID_ENERGY_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_ENERGY = FLUIDS.register("flowing_liquid_energy", () -> new ForgeFlowingFluid.Flowing(Fluids.LIQUID_ENERGY_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties LIQUID_ENERGY_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.LIQUID_ENERGY_FLUID_TYPE, LIQUID_ENERGY_SOURCE, FLOWING_LIQUID_ENERGY)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(blockinit.LIQUID_ENERGY_BLOCK).bucket(iteminit.LIQUID_ENERGY_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
