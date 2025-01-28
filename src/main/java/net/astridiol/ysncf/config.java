package net.astridiol.ysncf;

import net.astridiol.ysncf.block.ModBlocks;
import net.astridiol.ysncf.item.ModItemGroup;
import net.astridiol.ysncf.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class yourbad implements ModInitializer {
	public static final String MOD_ID = "yourbad";
	public static final Logger LOGGER = LoggerFactory.getLogger("yourbad");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
