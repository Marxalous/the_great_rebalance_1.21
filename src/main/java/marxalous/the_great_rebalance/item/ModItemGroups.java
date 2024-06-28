package marxalous.the_great_rebalance.item;

import marxalous.the_great_rebalance.TheGreatRebalance;
import marxalous.the_great_rebalance.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

	public static final ItemGroup THE_GREAT_REBALANCE_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.tryParse(TheGreatRebalance.MOD_ID + ":" + "the_great_rebalance_itemgroup"),
			FabricItemGroup.builder()
					.displayName(Text.translatable("itemgroup.the_great_rebalance"))
					.icon(() -> new ItemStack(Items.ACACIA_BOAT))
					.entries((displayContext, entries) -> {
						entries.add(ModBlocks.ENHANCED_POWERED_RAIL);
						entries.add(ModItems.OUTPOST_KEY);
						entries.add(ModItems.OMINOUS_OUTPOST_KEY);
						entries.add(ModItems.GRIMSTONE_INGOT);
						entries.add(ModItems.GRIMSTONE_SCRAP);
					})
					.build());

	public static void registerItemGroups() {
		TheGreatRebalance.LOGGER.info("Registering Item Groups for " + TheGreatRebalance.MOD_ID);
	}
}
