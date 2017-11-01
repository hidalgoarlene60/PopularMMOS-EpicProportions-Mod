package com.jtrent238.epicproportions.addons.halloween.blocks;

import java.util.Random;

import com.jtrent238.epicproportions.addons.halloween.BlockLoader;
import com.jtrent238.epicproportions.addons.halloween.ItemLoader;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class blockHalloweenEssenceOre extends BlockOre{

	public blockHalloweenEssenceOre(Material ground) {
		
	}
	@Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        return 5;
    }
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == BlockLoader.blockHalloweenEssenceOre ? ItemLoader.itemHalloweenEssence : (this == Blocks.diamond_ore ? Items.diamond : (this == Blocks.lapis_ore ? Items.dye : (this == Blocks.emerald_ore ? Items.emerald : (this == Blocks.quartz_ore ? Items.quartz : Item.getItemFromBlock(this)))));
    }
	
	/**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return this == BlockLoader.blockHalloweenEssenceOre ? 4 + p_149745_1_.nextInt(5) : 1;
    }
}
