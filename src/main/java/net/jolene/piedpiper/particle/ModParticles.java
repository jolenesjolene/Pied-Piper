package net.jolene.piedpiper.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.jolene.piedpiper.PiedPiper;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final SimpleParticleType HARMONY =
            registerParticle("note", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(PiedPiper.MOD_ID, name), particleType);
    }

    public static void registerModParticles() {
        PiedPiper.LOGGER.info("Registering Particles for " + PiedPiper.MOD_ID);
    }
}