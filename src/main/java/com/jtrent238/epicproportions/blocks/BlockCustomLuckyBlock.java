package com.jtrent238.epicproportions.blocks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import mod.lucky.Lucky;
import mod.lucky.block.BlockLuckyBlock;
import mod.lucky.drop.LuckyDropBase;
import mod.lucky.util.ExpressionParser;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCustomLuckyBlock extends BlockLuckyBlock{

	public BlockCustomLuckyBlock(Material material) {
		super(material);
	}

	public static String getConfigVersion()
	  {
	    File file = new File("config/lucky/CustomLuckyBlockProperties.txt");
	    if (!file.exists()) {
	      return "";
	    }
	    try
	    {
	      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("config/lucky/CustomLuckyBlockProperties.txt")));
	      String version = br.readLine();
	      br.close();
	      if (version != null) {
	        return version;
	      }
	      return "";
	    }
	    catch (Exception e) {}
	    return "";
	  }
	
	public static void readConfig()
	  {
	    try
	    {
	      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("config/lucky/LuckyBlockProperties.txt")));
	      
	      String section = "";
	      
	      boolean addSeparator = false;
	      
	      ArrayList<LuckyDropBase> drops = new ArrayList();
	      ArrayList<Item> luckyCraftingItemsList = new ArrayList();
	      ArrayList<Integer> luckyCraftingItemDamageList = new ArrayList();
	      ArrayList<Integer> luckyCraftingLevelsList = new ArrayList();
	      
	      
	      Lucky.instance.allDrops = ((LuckyDropBase[])drops.toArray(new LuckyDropBase[drops.size()]));
	      Lucky.instance.luckyCrafting.luckyCraftingItems = ((Item[])luckyCraftingItemsList.toArray(new Item[luckyCraftingItemsList.size()]));
	      //Lucky.instance.luckyCrafting.luckyCraftingItemDamage = convertIntListToArray(luckyCraftingItemDamageList);
	      //Lucky.instance.luckyCrafting.luckyCraftingLevels = convertIntListToArray(luckyCraftingLevelsList);
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	  }
}
