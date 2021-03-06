package com.jtrent238.epicproportions.tileentity;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.entity.EntityFred2_0;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityFred2_0Spawner    extends TileEntity
{
    private final Fred2_0SpawnerBaseLogic field_145882_a = new Fred2_0SpawnerBaseLogic()
    {
        private static final String __OBFID = "CL_00000361";
        public void func_98267_a(int p_98267_1_)
        {
        	TileEntityFred2_0Spawner.this.worldObj.addBlockEvent(TileEntityFred2_0Spawner.this.xCoord, TileEntityFred2_0Spawner.this.yCoord, TileEntityFred2_0Spawner.this.zCoord, BlockLoader.BlockFred2_0Spawner, p_98267_1_, 0);
        }
        public World getSpawnerWorld()
        {
            return TileEntityFred2_0Spawner.this.worldObj;
        }
        public int getSpawnerX()
        {
            return TileEntityFred2_0Spawner.this.xCoord;
        }
        public int getSpawnerY()
        {
            return TileEntityFred2_0Spawner.this.yCoord;
        }
        public int getSpawnerZ()
        {
            return TileEntityFred2_0Spawner.this.zCoord;
        }
        public void setEntity(Entity p_98277_1_)
        {
            super.setEntityName(p_98277_1_);

            if (this.getSpawnerWorld() != null)
            {
                this.getSpawnerWorld().markBlockForUpdate(TileEntityFred2_0Spawner.this.xCoord, TileEntityFred2_0Spawner.this.yCoord, TileEntityFred2_0Spawner.this.zCoord);
            }
        }
        
    };
    private static final String __OBFID = "CL_00000360";

    public void readFromNBT(NBTTagCompound p_145839_1_)
    {
        super.readFromNBT(p_145839_1_);
        this.field_145882_a.readFromNBT(p_145839_1_);
    }

    public void writeToNBT(NBTTagCompound p_145841_1_)
    {
      //  super.writeToNBT(p_145841_1_);
        this.field_145882_a.writeToNBT(p_145841_1_);
    }

    public void updateEntity()
    {
        this.field_145882_a.updateSpawner();
        super.updateEntity();
    }

    /**
     * Overriden in a sign to provide the text.
     */
    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
       // this.writeToNBT(nbttagcompound);
        nbttagcompound.removeTag("SpawnPotentials");
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbttagcompound);
    }

    /**
     * Called when a client event is received with the event number and argument, see World.sendClientEvent
     */
    public boolean receiveClientEvent(int p_145842_1_, int p_145842_2_)
    {
        return this.field_145882_a.setDelayToMin(p_145842_1_) ? true : super.receiveClientEvent(p_145842_1_, p_145842_2_);
    }

    public Fred2_0SpawnerBaseLogic func_145881_a()
    {
        return this.field_145882_a;
        
    }

	
}