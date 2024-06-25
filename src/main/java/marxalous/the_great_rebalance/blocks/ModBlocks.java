package main.java.marxalous.the_great_rebalance.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import marxalous.the_great_rebalance.TheGreatRebalance;

public class ModBlocks {
	public static final Block TEST_BLOCK = registerBlock("test_block",
			new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.tryParse(TheGreatRebalance.MOD_ID + ":" + name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, Identifier.tryParse(TheGreatRebalance.MOD_ID + ":" + name),
				new BlockItem(block, new Item.Settings()));
	}

	public static void registerModBlocks() {
		TutorialMod.LOGGER.info("Registering ModBlocks for " + TheGreatRebalance.MOD_ID);
	}
}
