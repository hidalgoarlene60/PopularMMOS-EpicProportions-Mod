package com.jtrent238.epicproportions.entity;

import java.util.Random;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DungeonHooks;

public class EntityCaptianCookie extends EntityGolem implements IBossDisplayData
	{
		World world = null;
		private int attackTimer;
		private DamageSource damageSource;
		private EntityPlayer entityAttackedBy;
	    public EntityCaptianCookie(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 5;
	        this.isImmuneToFire = true;
	        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
	        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
	        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
	        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
	       
	        this.hasCustomNameTag();
	        this.setCustomNameTag("Captian Cookie");
	        addRandomArmor();
	        DungeonHooks.addDungeonMob("Captian Cookie", 180);
	    }
	    
	   
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    }

	    public boolean attackEntityAsMob(Entity p_70652_1_)
	    {
	        this.attackTimer = 10;
	        this.worldObj.setEntityState(this, (byte)4);
	        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

	        if (flag)
	        {
	            p_70652_1_.motionY += 0.4000000059604645D;
	        }

	        this.playSound("", 1.0F, 1.0F);
	        return flag;
	    }
	    
	    public boolean attackEntityFrom()
	    {
			
	    	if (getHealth() <= 0.0F)
	    	{
	    	    onDeath(damageSource);
	    	    if (entityAttackedBy instanceof EntityPlayer)
	    	    {
	    	        ((EntityPlayer)entityAttackedBy)
	    	              .addStat(Achievements.achievementcookies, 1);
	    	    }
	    	}
	    	
	    	return hasAttacked;
	    }
	    
	    
protected void addRandomArmor(){

}

protected void dropRareDrop(int par1){
this.dropItem(ItemLoader.itemCaptainCookieCookie, 1);
}


    	public boolean isAIEnabled()
		{
			   return true;
    	}
    	   
    	/**
         * Determines if an entity can be despawned, used on idle far away entities
         */
        protected boolean canDespawn()
        {
            return false;
        }
        
	    /**
	     * Drop items of this living's type
	     */
	    protected void dropFewItems(boolean var1, int var2)
	    {
	    	this.entityDropItem(new ItemStack(Items.cookie, 16), 4F);
	    }

	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    protected String getLivingSound()
	    {
	        return "";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return "epicproportionsmod:captaincookie_hurt";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return "epicproportionsmod:captaincookie_death";
	    }

	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		protected void fall(float l){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			super.fall(l);
			Entity entity = this;
			
		}

    	public void onCriticalHit(Entity entity2) {
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		public void onKillEntity(EntityLiving entityLiving){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

			/*
		public boolean interact(EntityPlayer entity2){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
			return true;
		}
		 	*/
		
		  /**
		    * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
		    */
				/*
		   public boolean interact(EntityPlayer p_70085_1_, World world,EntityPlayer entityplayer)
		   {
		       ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
		       boolean flag = itemstack != null && itemstack.getItem() == ItemLoader.itemSwordOfEpicProportions;
		       
		       this.kill();
		       this.spawnExplosionParticle();
		       
		       if(!world.isRemote)
		       {
		    	   EntityCaptianCookie_Evil par1 = new EntityCaptianCookie_Evil(world); //Just change"MyEntityCow" to any entity you would like to spawn
		       par1.setPosition(p_70085_1_.posX, p_70085_1_.posY+2,p_70085_1_.posZ+2); //These are the coordinates where he will appear 
		       world.spawnEntityInWorld(par1);
		       }
		       
		       
		           return true;
		       }
				 */
		   /**
		     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
		     */
		    public boolean interact(EntityPlayer p_70085_1_)
		    {
		        ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();

		        if (itemstack != null && itemstack.getItem() == ItemLoader.itemSwordOfEpicProportions)
		        {
		            if (itemstack.stackSize-- == 1)
		            {
		            	if(!world.isRemote)
		 		       {
		 		    	   EntityCaptianCookie_Evil par1 = new EntityCaptianCookie_Evil(world); //Just change"MyEntityCow" to any entity you would like to spawn
		 		       par1.setPosition(p_70085_1_.posX, p_70085_1_.posY+2,p_70085_1_.posZ+2); //These are the coordinates where he will appear 
		 		       world.spawnEntityInWorld(par1);
		 		       	this.kill();
			 		    this.spawnExplosionParticle();
		 		       }
		            	
		            }
		            else if (!p_70085_1_.inventory.addItemStackToInventory(new ItemStack(Blocks.air)))
		            {
		                p_70085_1_.dropPlayerItemWithRandomChoice(new ItemStack(Blocks.air, 1, 0), false);
		            }

		            return true;
		        }
		        else
		        {
		            return super.interact(p_70085_1_);
		        }
		    }

		   
		public String getEntityName(){
			return "Captian Cookie";
		}

	
   /**
    * Will return how many at most can spawn in a chunk at once.
    */
   public int getMaxSpawnedInChunk()
   {
       return 4;
   }
   
 
   
}
