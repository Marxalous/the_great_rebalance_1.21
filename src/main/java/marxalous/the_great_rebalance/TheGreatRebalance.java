package marxalous.the_great_rebalance;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import marxalous.the_great_rebalance.blocks.ModBlocks;
import marxalous.the_great_rebalance.item.ModItemGroups;
import marxalous.the_great_rebalance.item.ModItems;

public class TheGreatRebalance implements ModInitializer {
	public static final String MOD_ID = "the_great_rebalance";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}