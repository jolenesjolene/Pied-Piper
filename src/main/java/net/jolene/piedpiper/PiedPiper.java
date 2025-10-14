package net.jolene.piedpiper;

import net.fabricmc.api.ModInitializer;

import net.jolene.piedpiper.particle.ModParticles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PiedPiper implements ModInitializer {
	public static final String MOD_ID = "piedpiper";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModParticles.registerModParticles();

		LOGGER.info("I am playing notes n' stuff cuz I’m in modded Minecraft!!");
	}
}