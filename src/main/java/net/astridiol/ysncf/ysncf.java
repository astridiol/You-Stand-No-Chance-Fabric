package net.astridiol.ysncf;

import net.astridiol.ysncf.item.ModItemGroup;
import net.astridiol.ysncf.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class ysncf implements ModInitializer {
	public static final String MOD_ID = "ysncf";
	public static final Logger LOGGER = LoggerFactory.getLogger("ysncf");

	public ysncf() {
	}

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}
