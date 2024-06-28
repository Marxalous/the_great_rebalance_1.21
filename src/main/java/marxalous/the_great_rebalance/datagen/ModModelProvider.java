package marxalous.the_great_rebalance.datagen;

import marxalous.the_great_rebalance.blocks.ModBlocks;
import marxalous.the_great_rebalance.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerStraightRail(ModBlocks.ENHANCED_POWERED_RAIL);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.OUTPOST_KEY, Models.GENERATED);
		itemModelGenerator.register(ModItems.OMINOUS_OUTPOST_KEY, Models.GENERATED);
		itemModelGenerator.register(ModItems.GRIMSTONE_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.GRIMSTONE_SCRAP, Models.GENERATED);
	}
}
