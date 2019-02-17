package gtclassic.item;

import java.util.Arrays;
import java.util.List;

import gtclassic.GTMod;
import gtclassic.container.GTItemInventoryCraftingTablet;
import ic2.core.IC2;
import ic2.core.inventory.base.IHandHeldInventory;
import ic2.core.inventory.base.IHasGui;
import ic2.core.item.base.ItemIC2;
import ic2.core.platform.textures.Ic2Icons;
import ic2.core.util.misc.StackUtil;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GTItemCraftingTablet extends ItemIC2 implements IHandHeldInventory {

	public GTItemCraftingTablet() {
		this.maxStackSize = 1;
		this.setCreativeTab(GTMod.creativeTabGT);
		this.setRegistryName("crafting_tablet");
		this.setUnlocalizedName(GTMod.MODID + ".craftingTablet");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (IC2.platform.isSimulating()) {
			IC2.platform.launchGui(playerIn, this.getInventory(playerIn, handIn, playerIn.getHeldItem(handIn)), handIn);
		}

		return ActionResult.newResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("tooltip." + GTMod.MODID + ".craftingtablet"));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public TextureAtlasSprite getTexture(int meta) {
		return Ic2Icons.getTextures(GTMod.MODID + "_items")[35];
	}

	@Override
	public List<Integer> getValidVariants() {
		return Arrays.asList(0);
	}

	@Override
	public int getTextureEntry(int var1) {
		return 0;
	}

	@Override
	public int getGuiId(ItemStack stack) {
		NBTTagCompound nbt = StackUtil.getNbtData(stack);
		if (nbt.hasKey("GuiID")) {
			return nbt.getInteger("GuiID");
		}
		return -1;
	}

	@Override
	public IHasGui getInventory(EntityPlayer player, EnumHand hand, ItemStack stack) {
		return new GTItemInventoryCraftingTablet(player, this, stack);
	}

	@Override
	public void setGuiID(ItemStack stack, int id) {
		if (id == -1) {
			StackUtil.getOrCreateNbtData(stack).removeTag("GuiID");
			return;
		}
		StackUtil.getOrCreateNbtData(stack).setInteger("GuiID", id);
	}

}
