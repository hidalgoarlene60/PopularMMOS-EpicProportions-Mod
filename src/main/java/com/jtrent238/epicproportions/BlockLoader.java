package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.blocks.BlockBirthdayPresent_Custom;
import com.jtrent238.epicproportions.blocks.BlockFred2_0Spawner;
import com.jtrent238.epicproportions.blocks.BlockJenDirt;
import com.jtrent238.epicproportions.blocks.BlockJenDoor;
import com.jtrent238.epicproportions.blocks.BlockJenGrass;
import com.jtrent238.epicproportions.blocks.BlockModDoor;
import com.jtrent238.epicproportions.blocks.BlockModStem;
import com.jtrent238.epicproportions.blocks.BlockNuke;
import com.jtrent238.epicproportions.blocks.BlockPatDirt;
import com.jtrent238.epicproportions.blocks.BlockPatDoor;
import com.jtrent238.epicproportions.blocks.BlockPatGrass;
import com.jtrent238.epicproportions.blocks.BlockPumpkinJen;
import com.jtrent238.epicproportions.blocks.BlockPumpkinPat;
import com.jtrent238.epicproportions.blocks.BlockStatue;
import com.jtrent238.epicproportions.blocks.blockBirthdayPresent;
import com.jtrent238.epicproportions.blocks.blockBirthdayPresent_Bad;
import com.jtrent238.epicproportions.blocks.blockBirthdayPresent_Green;
import com.jtrent238.epicproportions.blocks.blockBombySpawner;
import com.jtrent238.epicproportions.blocks.blockFartBomb;
import com.jtrent238.epicproportions.blocks.blockJenChest;
import com.jtrent238.epicproportions.blocks.blockJenIngot;
import com.jtrent238.epicproportions.blocks.blockJenOre;
import com.jtrent238.epicproportions.blocks.blockJenTNT;
import com.jtrent238.epicproportions.blocks.blockModFlower;
import com.jtrent238.epicproportions.blocks.blockPatChest;
import com.jtrent238.epicproportions.blocks.blockPatIngot;
import com.jtrent238.epicproportions.blocks.blockPatOre;
import com.jtrent238.epicproportions.blocks.blockPatTNT;
import com.jtrent238.epicproportions.blocks.blockTrollTNT;
import com.jtrent238.epicproportions.blocks.cakes.BlockJenCake;
import com.jtrent238.epicproportions.blocks.cakes.BlockPatCake;
import com.jtrent238.epicproportions.blocks.statues.BlockCaptianCookieStatue;
import com.jtrent238.epicproportions.blocks.statues.BlockJenStatue;
import com.jtrent238.epicproportions.blocks.statues.BlockPatStatue;
import com.jtrent238.epicproportions.blocks.statues.BlockSparkyStatue;
import com.jtrent238.epicproportions.items.itemgemofepicproportions;

import cpw.mods.fml.common.registry.GameRegistry;
import javafx.scene.paint.Color;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockLoader {

	public static Block blockFartBomb;
	public static Block blockPatIngot;
	public static Block blockJenIngot;
	public static Block blockPatOre;
	public static Block blockJenOre;
	public static Block blockPatTNT;
	public static Block blockBirthdayPresent;
	public static Block blockBirthdayPresent_Green;
	public static Block BlockBirthdayPresent_Custom;
	public static Block blockBirthdayPresent_Bad;
	public static Block blockPatChest;
	public static Block blockJenChest;
	public static Block blockTrollTNT;
	public static Block blockFlowerForJen;
	public static Block blockFlowerRedHeart;
	public static Block blockFlowerPinkHeart;
	public static Block blockFlowerRainbow;
	public static Block blockFlowerLove;
	public static Block blockBombySpawner;
	public static Block BlockPatDoor;
	public static Block BlockJenDoor;
	public static Block blockFlowerChocolate;
	public static Block BlockFred2_0Spawner;
	public static Block BlockNuke;
	public static Block BlockStatue;
	public static Block BlockPatStatue;
	public static Block BlockJenStatue;
	public static Block BlockCaptianCookieStatue;
	public static Block BlockSparkyStatue;
	public static Block BlockPumpkinPat;
	public static Block BlockPumpkinPat_lit;
	public static Block BlockPumpkinJen;
	public static Block BlockPumpkinJen_lit;
	public static Block BlockModStem;
	public static Block BlockPatCake;
	public static Block BlockJenCake;
	public static Block BlockPatGrass;
	public static Block BlockPatDirt;
	public static Block BlockJenGrass;
	public static Block BlockJenDirt;
	public static Block BlockEpicProportionsPortal;
	public static Block blockJenTNT;
	
	
	
	
	
	public static final Block.SoundType soundTypeStone = new Block.SoundType("block_squish", 1.0F, 1.0F);
	
	//public static final BlockFlower jen_flower = (BlockFlower)Block.blockRegistry.getObject("jen_flower");
	//public static final BlockFlower jen_flower2 = (BlockFlower)Block.blockRegistry.getObject("jen_flower2");
	
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		blockFartBomb = new blockFartBomb().setBlockName("blockFartBomb").setBlockTextureName("epicproportionsmod:blockFartBomb").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatIngot = new blockPatIngot(MapColor.diamondColor).setBlockName("blockPatIngot").setBlockTextureName("epicproportionsmod:blockPatIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenIngot = new blockJenIngot(MapColor.pinkColor).setBlockName("blockJenIngot").setBlockTextureName("epicproportionsmod:blockJenIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatOre = new blockPatOre(Material.ground).setBlockName("blockPatOre").setBlockTextureName("epicproportionsmod:blockPatOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenOre = new blockJenOre(Material.ground).setBlockName("blockJenOre").setBlockTextureName("epicproportionsmod:blockJenOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatTNT = new blockPatTNT().setBlockName("blockPatTNT").setBlockTextureName("epicproportionsmod:blockPatTNT").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockBirthdayPresent = new blockBirthdayPresent(Material.ground).setBlockName("blockBirthdayPresent").setBlockTextureName("epicproportionsmod:blockBirthdayPresent").setHardness(0.5F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockBirthdayPresent_Green = new blockBirthdayPresent_Green(Material.ground).setBlockName("blockBirthdayPresent_Green").setBlockTextureName("epicproportionsmod:blockBirthdayPresent_Green").setHardness(0.5F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		//BlockBirthdayPresent_Custom = new BlockBirthdayPresent_Custom(Material.ground).setBlockName(BlockBirthdayPresent_Custom.getCustomname).setBlockTextureName("epicproportionsmod:" + BlockBirthdayPresent_Custom.getCustomName).setHardness(0.5F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockBirthdayPresent_Bad = new blockBirthdayPresent_Bad(Material.ground).setBlockName("blockBirthdayPresent_Bad").setBlockTextureName("epicproportionsmod:blockBirthdayPresent").setHardness(0.5F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockPatChest = new blockPatChest(0).setBlockName("blockPatChest").setBlockTextureName("epicproportionsmod:blockPatChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenChest = new blockJenChest(0).setBlockName("blockJenChest").setBlockTextureName("epicproportionsmod:blockJenChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockTrollTNT = new blockTrollTNT().setBlockName("blockTrollTNT").setBlockTextureName("epicproportionsmod:blockTrollTNT").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockFlowerForJen = new blockModFlower(0).setBlockName("blockFlowerForJen").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);;
		blockFlowerRedHeart = new blockModFlower(1).setBlockName("blockFlowerRedHeart").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);;
		blockFlowerPinkHeart = new blockModFlower(2).setBlockName("blockFlowerPinkHeart").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockFlowerRainbow = new blockModFlower(3).setBlockName("blockFlowerRainbow").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockFlowerLove = new blockModFlower(4).setBlockName("blockFlowerLove").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockBombySpawner = new blockBombySpawner().setBlockName("blockBombySpawner").setBlockTextureName("epicproportionsmod:blockBombySpawner").setHardness(3F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockJenDoor = new BlockJenDoor(Material.iron).setBlockName("BlockJenDoor")/*/.setBlockTextureName("epicproportionsmod:BlockJenDoor")/*/.setHardness(2F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPatDoor = new BlockPatDoor(Material.iron).setBlockName("BlockPatDoor")/*/.setBlockTextureName("epicproportionsmod:BlockPatDoor")/*/.setHardness(2F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockFlowerChocolate = new blockModFlower(5).setBlockName("blockFlowerChocolate").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		BlockFred2_0Spawner = new BlockFred2_0Spawner().setBlockName("BlockFred2_0Spawner").setBlockTextureName("epicproportionsmod:BlockFred2_0Spawner").setHardness(3F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockNuke = new BlockNuke().setBlockName("BlockNuke").setBlockTextureName("epicproportionsmod:BlockNuke").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockStatue = new BlockStatue(Material.rock).setBlockName("BlockStatue").setBlockTextureName("epicproportionsmod:BlockStatue").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPatStatue = new BlockPatStatue(Material.rock).setBlockName("BlockPatStatue").setBlockTextureName("epicproportionsmod:EntityPat").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockJenStatue = new BlockJenStatue(Material.rock).setBlockName("BlockJenStatue").setBlockTextureName("epicproportionsmod:EntityJen").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockCaptianCookieStatue = new BlockCaptianCookieStatue(Material.rock).setBlockName("BlockCaptianCookieStatue").setBlockTextureName("epicproportionsmod:EntityCaptianCookieStatue").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockSparkyStatue = new BlockSparkyStatue(Material.rock).setBlockName("BlockSparkyStatue").setBlockTextureName("epicproportionsmod:BlockSparkyStatue").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinPat = new BlockPumpkinPat(false).setBlockName("BlockPumpkinPat").setBlockTextureName("epicproportionsmod:BlockPumpkinPat").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinPat_lit = new BlockPumpkinPat(true).setBlockName("BlockPumpkinPat_lit").setBlockTextureName("epicproportionsmod:BlockPumpkinPat").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinJen = new BlockPumpkinJen(false).setBlockName("BlockPumpkinJen").setBlockTextureName("epicproportionsmod:BlockPumpkinJen").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinJen_lit = new BlockPumpkinJen(true).setBlockName("BlockPumpkinJen_lit").setBlockTextureName("epicproportionsmod:BlockPumpkinJen").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockModStem = new BlockModStem(BlockPumpkinPat);
		BlockModStem = new BlockModStem(BlockPumpkinJen);
		BlockPatCake = new BlockPatCake().setBlockName("BlockPatCake").setBlockTextureName("epicproportionsmod:BlockPatCake").setHardness(1F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenCake = new BlockJenCake().setBlockName("BlockJenCake").setBlockTextureName("epicproportionsmod:BlockJenCake").setHardness(1F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatGrass = new BlockPatGrass().setBlockName("BlockPatGrass").setBlockTextureName("epicproportionsmod:BlockPatGrass").setHardness(1.6F).setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatDirt = new BlockPatDirt().setBlockName("BlockPatDirt").setBlockTextureName("epicproportionsmod:BlockPatDirt").setHardness(1.5F).setStepSound(Block.soundTypeGravel).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenGrass = new BlockJenGrass().setBlockName("BlockJenGrass").setBlockTextureName("epicproportionsmod:BlockJenGrass").setHardness(1.6F).setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenDirt = new BlockJenDirt().setBlockName("BlockJenDirt").setBlockTextureName("epicproportionsmod:BlockJenDirt").setHardness(1.5F).setStepSound(Block.soundTypeGravel).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockEpicProportionsPortal = new BlockEpicProportionsPortal(Material.portal).setBlockName("BlockEpicProportionsPortal").setBlockTextureName("epicproportionsmod:BlockEpicProportionsPortal").setHardness(0F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockJenTNT = new blockJenTNT().setBlockName("blockJenTNT").setBlockTextureName("epicproportionsmod:blockJenTNT").setHardness(0F).setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		GameRegistry.registerBlock(blockFartBomb, "blockFartBomb");
		GameRegistry.registerBlock(blockPatIngot, "blockPatIngot");
		GameRegistry.registerBlock(blockJenIngot, "blockJenIngot");
		GameRegistry.registerBlock(blockPatOre, "blockPatOre");
		GameRegistry.registerBlock(blockJenOre, "blockJenOre");
		GameRegistry.registerBlock(blockPatTNT, "blockPatTNT");
		GameRegistry.registerBlock(blockBirthdayPresent, "blockBirthdayPresent");
		GameRegistry.registerBlock(blockBirthdayPresent_Bad, "blockBirthdayPresent_Bad");
		//GameRegistry.registerBlock(blockBirthdayPresent_Green, "blockBirthdayPresent_Green");
		GameRegistry.registerBlock(blockPatChest, "blockPatChest");
		GameRegistry.registerBlock(blockJenChest, "blockJenChest");
		GameRegistry.registerBlock(blockTrollTNT, "blockTrollTNT");
		GameRegistry.registerBlock(blockFlowerForJen, "blockFlowerForJen");
		GameRegistry.registerBlock(blockFlowerRedHeart, "blockFlowerRedHeart");
		GameRegistry.registerBlock(blockFlowerPinkHeart, "blockFlowerPinkHeart");
		GameRegistry.registerBlock(blockFlowerRainbow, "blockFlowerRainbow");
		GameRegistry.registerBlock(blockFlowerLove, "blockFlowerLove");
		GameRegistry.registerBlock(blockBombySpawner, "blockBombySpawner");
		GameRegistry.registerBlock(BlockPatDoor, "BlockPatDoor");
		GameRegistry.registerBlock(BlockJenDoor, "BlockJenDoor");
		GameRegistry.registerBlock(blockFlowerChocolate, "blockFlowerChocolate");
		GameRegistry.registerBlock(BlockFred2_0Spawner, "BlockFred2_0Spawner");
		GameRegistry.registerBlock(BlockNuke, "BlockNuke");
		//GameRegistry.registerBlock(BlockStatue, "BlockStatue");
		GameRegistry.registerBlock(BlockPatStatue, "BlockPatStatue");
		GameRegistry.registerBlock(BlockJenStatue, "BlockJenStatue");
		GameRegistry.registerBlock(BlockCaptianCookieStatue, "BlockCaptianCookieStatue");
		GameRegistry.registerBlock(BlockSparkyStatue, "BlockSparkyStatue");
		GameRegistry.registerBlock(BlockPumpkinPat, "BlockPumpkinPat");
		GameRegistry.registerBlock(BlockPumpkinPat_lit, "BlockPumpkinPat_lit");
		GameRegistry.registerBlock(BlockPumpkinJen, "BlockPumpkinJen");
		GameRegistry.registerBlock(BlockPumpkinJen_lit, "BlockPumpkinJen_lit");
		GameRegistry.registerBlock(BlockModStem, "BlockModStem");
		GameRegistry.registerBlock(BlockPatCake, "BlockPatCake");
		GameRegistry.registerBlock(BlockJenCake, "BlockJenCake");
		GameRegistry.registerBlock(BlockPatGrass, "BlockPatGrass");
		GameRegistry.registerBlock(BlockPatDirt, "BlockPatDirt");
		GameRegistry.registerBlock(BlockJenGrass, "BlockJenGrass");
		GameRegistry.registerBlock(BlockJenDirt, "BlockJenDirt");
		GameRegistry.registerBlock(BlockEpicProportionsPortal, "BlockEpicProportionsPortal");
		GameRegistry.registerBlock(blockJenTNT, "blockJenTNT");

		

		if(EpicProportionsMod.BIRTHDAYPRESENT_CUSTOM == true){
			GameRegistry.registerBlock(BlockBirthdayPresent_Custom, "BlockBirthdayPresent_Custom");
		}
		
	}
	
	
}
