package marxalous.the_great_rebalance;

import marxalous.the_great_rebalance.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TheGreatRebalanceClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENHANCED_POWERED_RAIL, RenderLayer.getCutout());
	}
}