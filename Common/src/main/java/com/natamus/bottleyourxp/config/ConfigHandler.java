package com.natamus.bottleyourxp.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.bottleyourxp.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean damageOnCreation = true;
	@Entry(min = 1, max = 20) public static int halfHeartDamageAmount = 1;
	@Entry(min = 0, max = 100) public static int rawXpConsumedOnCreation = 10;

	public static void initConfig() {
		configMetaData.put("damageOnCreation", Arrays.asList(
			"If enabled, damages the user whenever they create an experience bottle."
		));
		configMetaData.put("halfHeartDamageAmount", Arrays.asList(
			"The amount of damage the user takes times half a heart when creating an experience bottle."
		));
		configMetaData.put("rawXpConsumedOnCreation", Arrays.asList(
			"The amount of raw xp it takes to produce an experience bottle. Be careful when setting this too low, as it may enable xp duplication."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}