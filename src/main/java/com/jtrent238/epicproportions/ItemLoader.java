package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.items.itemCaptainCookieCookie;
import com.jtrent238.epicproportions.items.itemJenIngot;
import com.jtrent238.epicproportions.items.itemJenslips;
import com.jtrent238.epicproportions.items.itemPatIngot;
import com.jtrent238.epicproportions.items.itemSpawnEgg;
import com.jtrent238.epicproportions.items.itemgemofepicproportions;
import com.jtrent238.epicproportions.items.spawners.itemSpawnBomby;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCandyMan;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCaptianCookie;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCookieLittle;
import com.jtrent238.epicproportions.items.spawners.itemSpawnFred2_0;
import com.jtrent238.epicproportions.items.spawners.itemSpawnJen;
import com.jtrent238.epicproportions.items.spawners.itemSpawnNinjaMaster;
import com.jtrent238.epicproportions.items.spawners.itemSpawnPat;
import com.jtrent238.epicproportions.items.tools.weapons.itemJenSword;
import com.jtrent238.epicproportions.items.tools.weapons.itemPatSword;
/*
import com.jtrent238.foodmod.FoodMod;
import com.jtrent238.mcrustmod.items.can_beans_empty;
import com.jtrent238.mcrustmod.items.can_tuna_empty;
import com.jtrent238.mcrustmod.items.ammo.ammo_handmade_shell;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_explosive;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_incendiary;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_basic;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_smoke;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun_slug;
import com.jtrent238.mcrustmod.items.ammo.arrow_hv;
import com.jtrent238.mcrustmod.items.ammo.arrow_wooden;
import com.jtrent238.mcrustmod.items.food.can_beans;
import com.jtrent238.mcrustmod.items.food.can_tuna;
import com.jtrent238.mcrustmod.items.seeds.seed_corn;
import com.jtrent238.mcrustmod.items.seeds.seed_hemp;
import com.jtrent238.mcrustmod.items.seeds.seed_pumpkin;
import com.jtrent238.mcrustmod.items.tools.axe_salvaged;
import com.jtrent238.mcrustmod.items.tools.hammer;
import com.jtrent238.mcrustmod.items.tools.hammer_salvaged;
import com.jtrent238.mcrustmod.items.tools.hatchet;
import com.jtrent238.mcrustmod.items.tools.icepick_salvaged;
import com.jtrent238.mcrustmod.items.tools.lantern;
import com.jtrent238.mcrustmod.items.tools.pickaxe;
import com.jtrent238.mcrustmod.items.tools.stone_hatchet;
import com.jtrent238.mcrustmod.items.tools.stone_pickaxe;
import com.jtrent238.weaponmod.Itemcheeseknife;
*/
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemRecord;

public class ItemLoader {

	public static Item itemgemofepicproportions;
	public static Item itemPatIngot;
	public static Item itemJenIngot;
	public static Item itemJenslips;
	public static Item itemCaptainCookieCookie;
	
	public static Item itemTNTSwordSpawner;
	
	//Weapons & Tools
	public static Item itemPatSword;
	public static Item itemJenSword;
	
	//SpawnEggs//
	public static Item itemSpawnEgg;
	public static Item itemSpawnBomby;
	public static Item itemSpawnCaptianCookie;
	public static Item itemSpawnPat;
	public static Item itemSpawnJen;
	public static Item itemSpawnFred2_0;
	public static Item itemSpawnNinjaMaster;
	public static Item itemSpawnCandyMan;
	public static Item itemSpawnCookieLittle;
	
	//CrossMod FoodMod
	public static Item itembuttercandy;

		
	/**
	 * Load Items.
	 */
public static void LoadItems() {

	itemgemofepicproportions = new itemgemofepicproportions().setUnlocalizedName("itemgemofepicproportions").setTextureName("epicproportionsmod:itemgemofepicproportions").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatIngot = new itemPatIngot().setUnlocalizedName("itemPatIngot").setTextureName("epicproportionsmod:itemPatIngot").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenIngot = new itemJenIngot().setUnlocalizedName("itemJenIngot").setTextureName("epicproportionsmod:itemJenIngot").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenslips = new itemJenslips().setUnlocalizedName("itemJenslips").setTextureName("epicproportionsmod:itemJenslips").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemCaptainCookieCookie = new itemCaptainCookieCookie("cookie_cd").setUnlocalizedName("itemCaptainCookieCookie").setTextureName("epicproportionsmod:itemCaptainCookieCookie").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	//itemTNTSwordSpawner = new com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordSpawner().setUnlocalizedName("itemTNTSwordSpawner").setTextureName("epicproportionsmod:itemTNTSwordSpawner").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	//Weapons & Tools
	itemPatSword = new itemPatSword(ToolMaterial.EMERALD).setUnlocalizedName("itemPatSword").setTextureName("epicproportionsmod:itemPatSword").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenSword = new itemJenSword(ToolMaterial.EMERALD).setUnlocalizedName("itemJenSword").setTextureName("epicproportionsmod:itemJenSword").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	//SpawnEggs//
	itemSpawnEgg = new itemSpawnEgg().setUnlocalizedName("itemSpawnEgg").setTextureName("epicproportionsmod:itemSpawnEgg").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnBomby = new itemSpawnBomby().setUnlocalizedName("itemSpawnBomby").setTextureName("epicproportionsmod:itemSpawnBomby").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnCaptianCookie = new itemSpawnCaptianCookie().setUnlocalizedName("itemSpawnCaptianCookie").setTextureName("epicproportionsmod:itemSpawnCaptianCookie").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnPat = new itemSpawnPat().setUnlocalizedName("itemSpawnPat").setTextureName("epicproportionsmod:itemSpawnPat").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnJen = new itemSpawnJen().setUnlocalizedName("itemSpawnJen").setTextureName("epicproportionsmod:itemSpawnJen").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnFred2_0 = new itemSpawnFred2_0().setUnlocalizedName("itemSpawnFred2_0").setTextureName("epicproportionsmod:itemSpawnFred2_0").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnNinjaMaster = new itemSpawnNinjaMaster().setUnlocalizedName("itemSpawnNinjaMaster").setTextureName("epicproportionsmod:itemSpawnNinjaMaster").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnCandyMan = new itemSpawnCandyMan().setUnlocalizedName("itemSpawnCandyMan").setTextureName("epicproportionsmod:itemSpawnCandyMan").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnCookieLittle = new itemSpawnCookieLittle().setUnlocalizedName("itemSpawnCookieLittle").setTextureName("epicproportionsmod:itemSpawnCookieLittle").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

	GameRegistry.registerItem(itemgemofepicproportions, itemgemofepicproportions.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatIngot, itemPatIngot.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenIngot, itemJenIngot.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenslips, itemJenslips.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCaptainCookieCookie, itemCaptainCookieCookie.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemTNTSwordSpawner, itemTNTSwordSpawner.getUnlocalizedName().substring(5));
	
	//Weapons & Tools
	GameRegistry.registerItem(itemPatSword, itemPatSword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenSword, itemJenSword.getUnlocalizedName().substring(5));
	
	//SpawnEggs//
	GameRegistry.registerItem(itemSpawnEgg, itemSpawnEgg.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnBomby, itemSpawnBomby.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnCaptianCookie, itemSpawnCaptianCookie.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnPat, itemSpawnPat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnJen, itemSpawnJen.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnFred2_0, itemSpawnFred2_0.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnNinjaMaster, itemSpawnNinjaMaster.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnCandyMan, itemSpawnCandyMan.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnCookieLittle, itemSpawnCookieLittle.getUnlocalizedName().substring(5));
	
}

}
