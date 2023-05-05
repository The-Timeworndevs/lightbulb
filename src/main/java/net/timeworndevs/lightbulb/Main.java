package net.timeworndevs.lightbulb;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.lightbulb.registry.Blocks;
import net.timeworndevs.lightbulb.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MOD_ID = "lightbulb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Blocks.register();
	}
}
