package com.jtrent238.epicproportions.items.spawners;

import com.jtrent238.epicproportions.entity.EntityKami;
import com.jtrent238.epicproportions.entity.EntityKitty;
import com.jtrent238.epicproportions.entity.EntityLuckyChicken;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class itemSpawnLuckyChicken     extends Item
{
    @SideOnly(Side.CLIENT)
    private IIcon theIcon;

    private static final String __OBFID = "CL_00000070";

    
  //This allows Right Click to spawn entity
    public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer entityplayer)
    {
    if(!world.isRemote)
    {
    	EntityLuckyChicken par1 = new EntityLuckyChicken(world); //Just change"MyEntityCow" to any entity you would like to spawn
    	//par1.timeUntilNextEgg = (int) 0.01;
    	//par1.setHealth(1000);
    	par1.setCustomNameTag("Lucky Chicken");
    	par1.setPosition(entityplayer.posX, entityplayer.posY+2,entityplayer.posZ+2); //These are the coordinates where he will appear 
    world.spawnEntityInWorld(par1);
    }
    //entityplayer.addChatMessage("Its Captian Cookie!"); //This is a message you can add when he is spawned
    itemstack.damageItem(1, entityplayer); return itemstack;
    }
    
}