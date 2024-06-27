package marxalous.the_great_rebalance.datagen;

import java.util.concurrent.CompletableFuture;

import marxalous.the_great_rebalance.blocks.ModBlocks;
import marxalous.the_great_rebalance.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {

	public ModRecipeProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	public void generate(RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModBlocks.ENHANCED_POWERED_RAIL, 16)
				.pattern("GRG")
				.pattern("GSG")
				.pattern("GRG")
				.input('G', Items.GOLD_INGOT)
				.input('S', Items.STICK)
				.input('R', Items.REDSTONE)
				.criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
				.offerTo(exporter, Identifier.tryParse(getRecipeName(ModBlocks.ENHANCED_POWERED_RAIL)));

		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRIMSTONE_INGOT, 1)
				.pattern("EEE")
				.pattern("E G")
				.pattern("GGG")
				.input('E', Items.EMERALD)
				.input('G', ModItems.GRIMSTONE_SCRAP)
				.criterion(hasItem(ModItems.GRIMSTONE_SCRAP), conditionsFromItem(ModItems.GRIMSTONE_SCRAP))
				.offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.GRIMSTONE_INGOT)));
	}
}
