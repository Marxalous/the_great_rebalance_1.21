package marxalous.the_great_rebalance;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheGreatRebalance implements ModInitializer {
	public static final String MOD_ID = "the_great_rebalance";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric World!");
	}
}