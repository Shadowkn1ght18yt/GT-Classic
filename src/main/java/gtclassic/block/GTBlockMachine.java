package gtclassic.block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import gtclassic.GTBlocks;
import gtclassic.GTClassic;
import gtclassic.tileentity.GTTileEntityComputerCube;
import gtclassic.tileentity.GTTileEntityFusionComputer;
import gtclassic.tileentity.GTTileEntityIndustrialCentrifuge;
import gtclassic.tileentity.GTTileEntityLightningRod;
import ic2.core.block.base.BlockMultiID;
import ic2.core.block.base.tile.TileEntityBlock;
import ic2.core.platform.textures.Ic2Icons;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GTBlockMachine extends BlockMultiID {
	public enum GTBlockMachineVariants {
		AUTOCRAFTER, COMPUTERCUBE, CHARGEOMAT, INDUSTRIALCENTRIFUGE, MATTERFABRICATOR, UUMASSEMBLER, PLAYERDETECTOR,
		SONICTRON, LIGHTNINGROD, FUSIONCOMPUTER;
	}

	GTBlockMachineVariants variant;

	public GTBlockMachine(GTBlockMachineVariants variant) {
		super(Material.IRON);
		this.variant = variant;
		setRegistryName(variant.toString().toLowerCase());
		setUnlocalizedName(GTClassic.MODID + "." + variant.toString().toLowerCase());
		setCreativeTab(GTClassic.creativeTabGT);
		setHardness(4.0F);
		setResistance(20.0F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (this == GTBlocks.computerCube) {
			tooltip.add(I18n.format("tooltip." + GTClassic.MODID + ".computer"));
		} else if (this == GTBlocks.industrialCentrifuge) {
			tooltip.add(I18n.format("tooltip." + GTClassic.MODID + ".centrifuge"));
		} else if (this == GTBlocks.lightningRod) {
			tooltip.add(I18n.format("tooltip." + GTClassic.MODID + ".lightningrod"));
		} else if (this == GTBlocks.fusionComputer) {
			tooltip.add(I18n.format("tooltip." + GTClassic.MODID + ".fusioncomputer"));
		} else {
			tooltip.add(TextFormatting.RED + I18n.format("tooltip." + GTClassic.MODID + ".wip"));
		}

	}

	@Override
	public List<Integer> getValidMetas() {
		return Arrays.asList(0);
	}

	@Override
	public TileEntityBlock createNewTileEntity(World worldIn, int meta) {
		if (this == GTBlocks.computerCube) {
			return new GTTileEntityComputerCube();
		} else if (this == GTBlocks.industrialCentrifuge) {
			return new GTTileEntityIndustrialCentrifuge();
		} else if (this == GTBlocks.lightningRod) {
			return new GTTileEntityLightningRod();
		} else if (this == GTBlocks.fusionComputer) {
			return new GTTileEntityFusionComputer();
		} else {
			return new TileEntityBlock();
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public TextureAtlasSprite[] getIconSheet(int meta) {
		if (this == GTBlocks.autoCrafter) {
			return Ic2Icons.getTextures("gtclassic_autocrafter");
		} else if (this == GTBlocks.chargeOMat) {
			return Ic2Icons.getTextures("gtclassic_chargeomat");
		} else if (this == GTBlocks.computerCube) {
			return Ic2Icons.getTextures("gtclassic_computercube");
		} else if (this == GTBlocks.industrialCentrifuge) {
			return Ic2Icons.getTextures("gtclassic_industrialcentrifuge");
		} else if (this == GTBlocks.matterFabricator) {
			return Ic2Icons.getTextures("gtclassic_matterfabricator");
		} else if (this == GTBlocks.uuMatterAssembler) {
			return Ic2Icons.getTextures("gtclassic_uumatterassembler");
		} else if (this == GTBlocks.playerDetector) {
			return Ic2Icons.getTextures("gtclassic_playerdetector");
		} else if (this == GTBlocks.sonictronBlock) {
			return Ic2Icons.getTextures("gtclassic_sonictron");
		} else if (this == GTBlocks.lightningRod) {
			return Ic2Icons.getTextures("gtclassic_lightningrod");
		} else if (this == GTBlocks.fusionComputer) {
			return Ic2Icons.getTextures("gtclassic_fusioncomputer");
		} else {
			return Ic2Icons.getTextures("gtclassic_builder");
		}

	}

	@Override
	public int getMaxSheetSize(int meta) {
		return 1;
	}

	@Override
	public List<IBlockState> getValidStateList() {
		IBlockState def = getDefaultState();
		List<IBlockState> states = new ArrayList<>();
		for (EnumFacing side : EnumFacing.VALUES) {
			states.add(def.withProperty(getMetadataProperty(), 0).withProperty(allFacings, side).withProperty(active,
					false));
			states.add(def.withProperty(getMetadataProperty(), 0).withProperty(allFacings, side).withProperty(active,
					true));
		}
		return states;
	}

	@Override
	public List<IBlockState> getValidStates() {
		return getBlockState().getValidStates();
	}

	@Override
	@Deprecated
	public boolean canEntitySpawn(IBlockState state, Entity entityIn) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		TileEntity tile = worldIn.getTileEntity(pos);
		if (tile instanceof GTTileEntityFusionComputer) {
			if (((GTTileEntityFusionComputer) tile).isActive) {
				for (int i = -2; i <= 2; ++i) {
					for (int j = -2; j <= 2; ++j) {
						if (i > -2 && i < 2 && j == -1) {
							j = 2;
						}

						if (rand.nextInt(4) == 0) {
							for (int k = 0; k <= 1; ++k) {

								if (!worldIn.isAirBlock(pos.add(i / 2, 0, j / 2))) {
									break;
								}

								worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, (double) pos.getX() + 0.5D,
										(double) pos.getY() + 1.0D, (double) pos.getZ() + 0.5D,
										(double) ((float) i + rand.nextFloat()) - 0.5D,
										(double) ((float) k - rand.nextFloat() - 1.0F),
										(double) ((float) j + rand.nextFloat()) - 0.5D);
							}
						}
					}
				}
			}
		}
	}

}