package marxalous.the_great_rebalance;

import marxalous.the_great_rebalance.datagen.ModBlockTagProvider;
import marxalous.the_great_rebalance.datagen.ModItemTagProvider;
import marxalous.the_great_rebalance.datagen.ModLootTableProvider;
import marxalous.the_great_rebalance.datagen.ModModelProvider;
import marxalous.the_great_rebalance.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TheGreatRebalanceDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
