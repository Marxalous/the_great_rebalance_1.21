package marxalous.the_great_rebalance.item;

import marxalous.the_great_rebalance.TheGreatRebalance;
import marxalous.the_great_rebalance.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item GRIMSTONE_INGOT = registerItem("grimstone_ingot", new Item(new Item.Settings()));
	public static final Item GRIMSTONE_SCRAP = registerItem("grimstone_scrap", new Item(new Item.Settings()));
	public static final Item OUTPOST_KEY = registerItem("outpost_key", new Item(new Item.Settings()));
	public static final Item OMINOUS_OUTPOST_KEY = registerItem("ominous_outpost_key", new Item(new Item.Settings()));

	private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries) {
		entries.addAfter(Blocks.ACTIVATOR_RAIL, ModBlocks.ENHANCED_POWERED_RAIL);
	}

	private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
		entries.addAfter(Blocks.ACTIVATOR_RAIL, ModBlocks.ENHANCED_POWERED_RAIL);
	}

	private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
		entries.addAfter(Items.OMINOUS_TRIAL_KEY, ModItems.OUTPOST_KEY);
		entries.addAfter(ModItems.OUTPOST_KEY, ModItems.OMINOUS_OUTPOST_KEY);
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.tryParse(TheGreatRebalance.MOD_ID + ":" + name), item);
	}

	public static void registerModItems() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToRedstoneItemGroup);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
	}
}
