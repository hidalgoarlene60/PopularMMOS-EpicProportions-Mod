package com.jtrent238.epicproportions.eventhandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
//import sun.applet.Main;
//import sun.rmi.runtime.Log;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import java.sql.Date;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import ibxm.Player;

public class OnJoinEvent {
	
	
	private EntityPlayer playerclone;
	private String arg0;
	private String arg1;
	private int arg2;

	@SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

		event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("msg.epicproportionsmod.join." + "hello") + " " + EnumChatFormatting.YELLOW + "" + EnumChatFormatting.BOLD + event.player.getDisplayName() + EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "!"));
    	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/EnumChatFormatting.GREEN + "" + EnumChatFormatting.BOLD + EpicProportionsMod.MODNAME + " " + EnumChatFormatting.DARK_GREEN + "" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("msg.epicproportionsmod.join." + "madeby") + ": jtrent238"));
    	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/EnumChatFormatting.GOLD + "" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("msg.epicproportionsmod.join." + "running") + EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + " " + EpicProportionsMod.MODVERSION + " " + EnumChatFormatting.GOLD + "" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("msg.epicproportionsmod.join." + "of") + EnumChatFormatting.GOLD + "" + EnumChatFormatting.BOLD + " " + StatCollector.translateToLocal("msg.epicproportionsmod.join." + "themod") + "!"));
    	
    	//event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "Hello" + " " + EnumChatFormatting.YELLOW + "" + EnumChatFormatting.BOLD + event.player.getDisplayName() + EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "!"));
    	//event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/EnumChatFormatting.GREEN + "" + EnumChatFormatting.BOLD + EpicProportionsMod.MODNAME + " " + EnumChatFormatting.DARK_GREEN + "" + EnumChatFormatting.BOLD + "Made By:jtrent238"));
    	//event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/EnumChatFormatting.GOLD + "" + EnumChatFormatting.BOLD + "You are running" + EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + " " + EpicProportionsMod.MODVERSION + " " + EnumChatFormatting.GOLD + "" + EnumChatFormatting.BOLD + "of" + EnumChatFormatting.GOLD + "" + EnumChatFormatting.BOLD + " " + "the mod" + "!"));
    	//event.player.addChatComponentMessage(new ChatComponentText("�e�lLearn more at: �b�lhttp://bit.ly/FoodModWiki"));
    	event.player.triggerAchievement(Achievements.achievementinstall);
    	//event.player.addEntityCrashInfo(EpicProportionsMod.CRASHINFO);
    	//event.player.clonePlayer(playerclone, true);
    	event.player.extinguish();
    	event.player.getDisplayName();
    	//event.player.writeToNBT(EpicProportionsMod.NBTJOIN);
    	event.player.getBedLocation();
    	event.player.shouldHeal();
    	event.getListenerList();
    	event.hashCode();
    	Minecraft.getSystemTime();
    	Minecraft.isAmbientOcclusionEnabled();
    	Minecraft.isGuiEnabled();
    	Minecraft.getMinecraft();
    	Minecraft.getGLMaximumTextureSize();
    	Minecraft.isFancyGraphicsEnabled();
    	//Log.getLog(arg0, arg1, arg2);
    	//event.notifyAll();

    	
    }
			/*
	public void firstJoin(PlayerLoggedInEvent event) {
	      EntityPlayer player = event.player;
	      NBTTagCompound entityData = player.getEntityData();
	      if(entityData.getBoolean("firstJoin")) {
	         entityData.setBoolean("firstJoin", false);
	         player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.itemBirthdayPresent));
	      }
	   }
	   		*/
	
	@SubscribeEvent
	   public void JoinWorld(PlayerLoggedInEvent event) {
	      EntityPlayer player = event.player;
	      NBTTagCompound entityData = player.getEntityData();
	      String joinedBefore = "HasPlayerJoinedWorldBefore"/*player.PERSISTED_NBT_TAG*/;
	      Calendar calendar = Calendar.getInstance();

	      //String PlayerName = null;
	      //entityData.setString(PlayerName, player.getDisplayName());
	      
	      entityData.getBoolean(joinedBefore);
	      
	      if(entityData.getBoolean(joinedBefore) == false) {
	    	  
	         entityData.setBoolean(joinedBefore, true);
	         
	         if(EpicProportionsMod.PRESENT_ON_JOIN == true){ 
	        	 		player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.itemBirthdayPresent));
	         		}
	         
	         
			if (calendar.get(2) + 1 == 4 && calendar.get(5) == 4){
				
						event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Happy Birthday, " + EnumChatFormatting.GREEN + "jtrent238" + EnumChatFormatting.GOLD + "."));
				
				if(EpicProportionsMod.PRESENT_ON_DEVBIRTHDAY == true){
						player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.itemBirthdayPresent));
						event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Have a Free Birthday Present to Celebrate."));
					}
			}
	      }
	   }
	
	public <FreePresentOnJoin> int getchance(){
		
		int randomchance = 50;
		return randomchance;
		
	}
	
	
}