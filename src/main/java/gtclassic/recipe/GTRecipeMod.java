package gtclassic.recipe;

import gtclassic.GTBlocks;
import gtclassic.material.GTMaterial;
import gtclassic.material.GTMaterialGen;
import ic2.api.classic.recipe.ClassicRecipes;
import ic2.api.classic.recipe.crafting.ICraftingRecipeList;
import ic2.core.platform.registry.Ic2Items;

public class GTRecipeMod {

	static ICraftingRecipeList recipes = ClassicRecipes.advCrafting;
	static GTMaterialGen GT;
	static GTMaterial M;

	public static void recipesIC2() {
		/*
		 * Recipes for IC2-Classic
		 */

		recipes.addRecipe(Ic2Items.miningLaser.copy(),
				new Object[] { "Rcc", "AAC", " AA", 'A', Ic2Items.advancedAlloy.copy(), 'C', "circuitAdvanced", 'c',
						GT.getFluid(M.Helium, 1), 'R', "dustRedstone" });

		recipes.addRecipe(GT.getIc2(Ic2Items.solarPanel, 2),
				new Object[] { "YYY", "XPX", "CVC", 'C', Ic2Items.electricCircuit.copy(), 'V',
						Ic2Items.generator.copy(), 'X', "plateSilicon", 'Y', "blockGlass", 'P', Ic2Items.carbonPlate });

		recipes.overrideRecipe("shaped_Iridium Plate", GT.getIc2(Ic2Items.iridiumPlate, 1), "IAI", "ADA", "IAI", 'I',
				"ingotIridium", 'A', Ic2Items.advancedAlloy.copy(), 'D', "gemDiamond");

		recipes.addRecipe(Ic2Items.reactorReflectorThick.copy(),
				new Object[] { " P ", "PBP", " P ", 'P', Ic2Items.reactorReflector, 'B', GT.getFluid(M.Beryllium, 1) });

		recipes.addRecipe(GT.getIc2(Ic2Items.luminator, 16), new Object[] { "III", "GHG", "GGG", 'G', "blockGlass", 'I',
				"ingotSilver", 'H', GT.getFluid(M.Helium, 1), 'C', Ic2Items.insulatedCopperCable.copy() });

		recipes.addRecipe(GT.getIc2(Ic2Items.luminator, 16), new Object[] { "III", "GHG", "GGG", 'G', "blockGlass", 'I',
				"ingotSilver", 'H', GT.getFluid(M.Mercury, 1), 'C', Ic2Items.insulatedCopperCable.copy() });

		recipes.addRecipe(Ic2Items.mfe.copy(), new Object[] { "XYX", "YCY", "XYX", 'C', Ic2Items.machine.copy(), 'Y',
				GTBlocks.smallLithium, 'X', Ic2Items.doubleInsulatedGoldCable.copy() });

		recipes.addRecipe(Ic2Items.mfe.copy(), new Object[] { "XYX", "YCY", "XYX", 'C', Ic2Items.machine.copy(), 'Y',
				GTBlocks.smallLithium, 'X', GT.getIc2(Ic2Items.doubleInsulatedBronzeCable, 4) });

		recipes.addRecipe(GT.getIc2(Ic2Items.mixedMetalIngot, 3),
				new Object[] { "III", "BBB", "TTT", 'I', "plateSteel", 'B', "plateBronze", 'T', "plateAluminium" });

		recipes.addRecipe(GT.getIc2(Ic2Items.mixedMetalIngot, 1),
				new Object[] { "I  ", "B  ", "T  ", 'I', "plateSteel", 'B', "plateBronze", 'T', "plateAluminium" });

		recipes.addRecipe(GT.getIc2(Ic2Items.mixedMetalIngot, 6),
				new Object[] { "III", "BBB", "TTT", 'I', "plateSteel", 'B', "plateBronze", 'T', "plateTitanium" });

		recipes.addRecipe(GT.getIc2(Ic2Items.mixedMetalIngot, 2),
				new Object[] { "I ", "B ", "T ", 'I', "plateSteel", 'B', "plateBronze", 'T', "plateTitanium" });
	}

}
