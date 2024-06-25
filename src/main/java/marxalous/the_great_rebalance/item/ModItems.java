package marxalous.the_great_rebalance.item;

import marxalous.the_great_rebalance.TheGreatRebalance;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
	public static final Item GRIMSTONE_INGOT = registerItem("grimstone_ingot", new Item(new Item.Settings()));
	public static final Item GRIMSTONE_SCRAP = registerItem("grimstone_scrap", new Item(new Item.Settings()));

	private static void addItemsToFirstItemGroup(FabricItemGroupEntries entries) {
		entries.add(ModItems.GRIMSTONE_INGOT);
		entries.add(ModItems.GRIMSTONE_SCRAP);
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.tryParse(TheGreatRebalance.MOD_ID + ":" + name), item);
	}

	public static void registerModItems() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToFirstItemGroup);
	}
}
