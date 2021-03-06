package gtclassic.recipe;

import gtclassic.GTItems;
import gtclassic.material.GTMaterial;
import gtclassic.material.GTMaterialGen;
import gtclassic.tile.GTTileIndustrialElectrolyzer;
import ic2.api.classic.recipe.RecipeModifierHelpers.IRecipeModifier;
import ic2.api.classic.recipe.RecipeModifierHelpers.ModifierType;
import ic2.api.recipe.IRecipeInput;
import ic2.core.item.recipe.entry.RecipeInputItemStack;
import ic2.core.item.recipe.entry.RecipeInputOreDict;
import ic2.core.platform.registry.Ic2Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GTRecipeIndustrialElectrolyzer {

	static GTMaterialGen GT;
	static GTMaterial M;
	static GTTileIndustrialElectrolyzer Electrolyzer;

	public static void recipesElectrolyzer() {
		Electrolyzer.addRecipe(new IRecipeInput[] { input(GT.getModFluid("water", 6)) }, euCost(93000),
				GT.getFluid(M.Hydrogen, 4), GT.getFluid(M.Oxygen, 2));

		// TODO blah electrified water blah blah

		Electrolyzer.addRecipe(new IRecipeInput[] { input(new ItemStack(Items.DYE, 1, 15)), tubes(1) }, euCost(3000),
				GT.getFluid(M.Calcium, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input(GT.get(Items.SUGAR, 32)), tubes(5) }, euCost(6000),
				GT.getDust(M.Carbon, 2), GT.getModFluid("water", 5));

		Electrolyzer.addRecipe(new IRecipeInput[] { input(GT.get(Items.BLAZE_POWDER, 4)) }, euCost(7500),
				GT.getDust(M.DarkAshes, 1), GT.getDust(M.Sulfur, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("sand", 16), tubes(1) }, euCost(25000),
				GT.getDust(M.Silicon, 1), GT.getFluid(M.Oxygen, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustClay", 8), tubes(3) }, euCost(10000),
				GT.getFluid(M.Lithium, 1), GT.getDust(M.Silicon, 2), GT.getDust(M.Alumina, 2),
				GT.getFluid(M.Sodium, 2));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustCoal", 1) }, euCost(2000), GT.getDust(M.Carbon, 2));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustCharcoal", 1) }, euCost(2000), GT.getDust(M.Carbon, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustObsidian", 4), tubes(3) }, euCost(2500),
				GT.getSmallDust(M.Magnesium, 2), GT.getSmallDust(M.Iron, 2), GT.getDust(M.Silicon, 1),
				GT.getFluid(M.Oxygen, 2));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustAshes", 2) }, euCost(1250), GT.getDust(M.Carbon, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustSaltpeter", 10), tubes(7) }, euCost(6000),
				GT.getFluid(M.Potassium, 2), GT.getFluid(M.Nitrogen, 2), GT.getFluid(M.Oxygen, 3));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustEnderpearl", 10), tubes(16) }, euCost(65000),
				GT.getFluid(M.Nitrogen, 5), GT.getFluid(M.Beryllium, 1), GT.getFluid(M.Potassium, 4),
				GT.getFluid(M.Chlorine, 6));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustLazurite", 29), tubes(8) }, euCost(150000),
				GT.getDust(M.Alumina, 3), GT.getDust(M.Silicon, 3), GT.getFluid(M.Calcium, 4),
				GT.getFluid(M.Sodium, 4));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustBauxite", 12), tubes(8) }, euCost(150000),
				GT.getDust(M.Alumina, 8), GT.getDust(M.Silicon, 2), GT.getFluid(M.Hydrogen, 5),
				GT.getFluid(M.Oxygen, 3));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustPyrite", 3) }, euCost(16000),
				GT.getIc2(Ic2Items.ironDust, 1), GT.getDust(M.Sulfur, 2));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustCalcite", 10), tubes(5) }, euCost(56000),
				GT.getFluid(M.Calcium, 2), GT.getDust(M.Silicon, 2), GT.getFluid(M.Oxygen, 3));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustSodalite", 23), tubes(5) }, euCost(121500),
				GT.getFluid(M.Sodium, 4), GT.getDust(M.Alumina, 3), GT.getDust(M.Silicon, 3),
				GT.getFluid(M.Chlorine, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustFlint", 8) }, euCost(5000), GT.getDust(M.Silicon, 1),
				GT.getFluid(M.Oxygen, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustCinnabar", 3), tubes(1) }, euCost(16000),
				GT.getFluid(M.Mercury, 1), GT.getDust(M.Sulfur, 1), GT.get(Items.REDSTONE, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustSphalerite", 3) }, euCost(15000), GT.getDust(M.Zinc, 1),
				GT.getDust(M.Germanium, 1), GT.getDust(M.Sulfur, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustRuby", 6), tubes(3) }, euCost(25000),
				GT.getDust(M.Alumina, 2), GT.getDust(M.Chrome, 1), GT.getFluid(M.Oxygen, 3));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustSapphire", 5), tubes(3) }, euCost(20000),
				GT.getDust(M.Alumina, 2), GT.getFluid(M.Oxygen, 3));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustGreenSapphire", 1) }, euCost(5000),
				GT.getDust(M.Sapphire, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustEmerald", 21), tubes(12) }, euCost(30000),
				GT.getDust(M.Alumina, 5), GT.getFluid(M.Beryllium, 1), GT.getDust(M.Silicon, 6),
				GT.getFluid(M.Oxygen, 9));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustOlivine", 7), tubes(2) }, euCost(36000),
				GT.getDust(M.Magnesium, 2), GT.getIc2(Ic2Items.ironDust, 2), GT.getDust(M.Silicon, 1),
				GT.getFluid(M.Oxygen, 2));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustGalena", 3) }, euCost(120000),
				GT.getIc2(Ic2Items.silverDust, 1), GT.getDust(M.Lead, 1), GT.getDust(M.Sulfur, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustTantalite", 3) }, euCost(120000),
				GT.getDust(M.Tantalum, 1), GT.getDust(M.Niobium, 1), GT.getDust(M.Manganese, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustPyrope", 14), tubes(6) }, euCost(90000),
				GT.getDust(M.Magnesium, 3), GT.getDust(M.Alumina, 2), GT.getDust(M.Silicon, 3),
				GT.getFluid(M.Oxygen, 6));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustAlmandine", 14), tubes(6) }, euCost(82000),
				GT.getIc2(Ic2Items.ironDust, 3), GT.getDust(M.Alumina, 2), GT.getDust(M.Silicon, 3),
				GT.getFluid(M.Oxygen, 6));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustSpessartine", 14), tubes(6) }, euCost(92000),
				GT.getDust(M.Alumina, 2), GT.getDust(M.Manganese, 3), GT.getDust(M.Silicon, 3),
				GT.getFluid(M.Oxygen, 6));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustAndradite", 14), tubes(9) }, euCost(64000),
				GT.getFluid(M.Calcium, 3), GT.getIc2(Ic2Items.ironDust, 2), GT.getDust(M.Silicon, 3),
				GT.getFluid(M.Oxygen, 6));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustGrossular", 14), tubes(9) }, euCost(64000),
				GT.getFluid(M.Calcium, 3), GT.getDust(M.Alumina, 2), GT.getDust(M.Silicon, 3),
				GT.getFluid(M.Oxygen, 6));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustUvarovite", 14), tubes(9) }, euCost(110000),
				GT.getFluid(M.Calcium, 3), GT.getDust(M.Chrome, 2), GT.getDust(M.Silicon, 3), GT.getFluid(M.Oxygen, 6));

		Electrolyzer.addRecipe(new IRecipeInput[] { input(GT.getFluid(M.Methane, 5)) }, euCost(7500),
				GT.getFluid(M.Hydrogen, 4), GT.getDust(M.Carbon, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustGarnierite", 2) }, euCost(16000),
				GT.getDust(M.Nickel, 1), GT.getSmallDust(M.Nickel, 2), GT.getSmallDust(M.Cobalt, 2));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustPyrolusite", 3), tubes(1) }, euCost(16000),
				GT.getDust(M.Manganese, 2), GT.getFluid(M.Oxygen, 1));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustMolybdenite", 3), tubes(2) }, euCost(16000),
				GT.getDust(M.Molybdenum, 2), GT.getDust(M.Sulfur, 2));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustChromite", 7), tubes(3) }, euCost(16000),
				GT.getIc2(Ic2Items.ironDust, 2), GT.getDust(M.Chrome, 2), GT.getFluid(M.Oxygen, 3));

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustTantalite", 3), tubes(1) }, euCost(12000),
				GT.getDust(M.Tantalum, 1), GT.getDust(M.Niobium, 1), GT.getFluid(M.Oxygen, 1));
		
		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustLimonite", 3), tubes(2) }, euCost(12000),
				GT.getIc2(Ic2Items.ironDust, 1), GT.getFluid(M.Hydrogen, 1), GT.getFluid(M.Oxygen, 1));
		
		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustMalachite", 10), tubes(7) }, euCost(12000),
				GT.getIc2(Ic2Items.copperDust, 2),GT.getDust(M.Calcite, 1), GT.getModFluid("water", 3), GT.getFluid(M.Oxygen, 4));

		// Aluminium recipes

		Electrolyzer.addRecipe(new IRecipeInput[] { input("dustGraphite", 3), input("dustAlumina", 10),
				input(GT.getFluid(M.Cryolite, 1)) }, euCost(256000), GT.getDust(M.Aluminium, 4));

	}

	public static IRecipeInput input(ItemStack stack) {
		return new RecipeInputItemStack(stack);
	}

	public static IRecipeInput input(String name, int amount) {
		return new RecipeInputOreDict(name, amount);
	}

	public static IRecipeInput tubes(int amount) {
		return new RecipeInputItemStack(GT.get(GTItems.testTube, amount));
	}

	public static IRecipeModifier[] euCost(int total) {
		return new IRecipeModifier[] { ModifierType.RECIPE_LENGTH.create((total / 64) - 100) };
	}

}
