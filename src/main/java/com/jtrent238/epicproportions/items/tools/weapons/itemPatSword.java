package com.jtrent238.epicproportions.items.tools.weapons;

import com.google.common.collect.Multimap;
import com.jtrent238.epicproportions.EpicProportionsMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class itemPatSword extends ItemSword
{

	private static final int mySwordDamage = 999999999;
	private static final ToolMaterial material = ToolMaterial.EMERALD;
	private Object field_150934_a;

	public itemPatSword(ToolMaterial EMERALD) {
		super(EMERALD);
		this.field_150934_a = mySwordDamage + material.getDamageVsEntity();
	}
	
	
}