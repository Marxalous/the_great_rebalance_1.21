package main.java.marxalous.the_great_rebalance.blocks;

import marxalous.the_great_rebalance.TheGreatRebalance;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block ENHANCED_POWERED_RAIL = registerBlock("enhanced_powered_rail",
			new Block(AbstractBlock.Settings.copy(Blocks.POWERED_RAIL)));



	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.tryParse(TheGreatRebalance.MOD_ID + ":" + name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, Identifier.tryParse(TheGreatRebalance.MOD_ID + ":" + name),
				new BlockItem(block, new Item.Settings()));
	}

	public static void registerModBlocks() {
		TheGreatRebalance.LOGGER.info("Registering ModBlocks for " + TheGreatRebalance.MOD_ID);
	}
}
