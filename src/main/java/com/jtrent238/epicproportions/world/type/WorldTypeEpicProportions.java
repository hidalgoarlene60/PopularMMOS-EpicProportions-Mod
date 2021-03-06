package com.jtrent238.epicproportions.world.type;

import java.util.ArrayList;
import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;
import net.minecraft.util.WeightedRandom;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;


public class WorldTypeEpicProportions extends WorldType {

	


	private static final WorldType p_75901_2_ = EpicProportionsMod.WorldTypeEpicProportions;
	private BiomeEntry BiomeGenPat;
	private BiomeEntry BiomeGenJen;

	//int epicIdx = BiomeManager.BiomeType.WARM.ordinal();
	private List<BiomeEntry>[] biomes = new ArrayList[BiomeManager.BiomeType.values().length];
	private int epicIdx;

	public WorldTypeEpicProportions(int i, String name) {
		super(name);
		//GenLayerBiome.initializeAllBiomeGenerators(p_75901_0_, p_75901_2_);
		//GenLayerBiome.initializeAllBiomeGenerators(p_75901_1_, p_75901_2_);
		
		//BiomeManager.addBiome(BiomeType.WARM, BiomeGenPat);
		//BiomeManager.addBiome(BiomeType.WARM, BiomeGenJen);
		biomesForTheCustomWorld();
		
	}

	private void biomesForTheCustomWorld() {
		
		
		//BiomeManager.addBiome(BiomeType.WARM, BiomeGenPat);
		//BiomeManager.addBiome(BiomeType.WARM, BiomeGenJen);
		
		//biomes[epicIdx].clear();
		
		//biomes[epicIdx].add(new BiomeEntry(EpicProportionsMod.BIOMEPAT, 10));
		//biomes[epicIdx].add(new BiomeEntry(EpicProportionsMod.BIOMEJEN, 10));
		
		GenLayer.getModdedBiomeSize(this, (byte) 12);
		//GenLayer.initializeAllBiomeGenerators(15, this);
		
	
	}

	/*
	public static class BiomeEntry extends WeightedRandom.Item
    {
        public final BiomeGenBase biome;
        
        public BiomeEntry(BiomeGenBase biome, int weight)
        {
            super(weight);
            
            this.biome = biome;
           
        }
    }
	*/
	//public net.minecraftforge.common.BiomeManager.BiomeEntry BiomeGenPat;
	//public net.minecraftforge.common.BiomeManager.BiomeEntry BiomeGenJen;
	//public BiomeGenBase[] BiomeGenPat;
	//public BiomeGenBase[] BiomeGenJen;
	
	
	@Override
	public String getWorldTypeName()
	{
		 return "EPIC_PROPORTIONS_WORLD_TYPE";
	}

	
	
	
	}
