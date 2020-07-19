// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedDataWatcher;
import org.bukkit.entity.EntityType;
import java.util.UUID;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import com.comphenix.protocol.ProtocolLibrary;
import org.bukkit.entity.Entity;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.injector.PacketConstructor;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerSpawnEntityLiving extends AbstractPacket
{
    public static final PacketType TYPE;
    private static PacketConstructor entityConstructor;
    
    public WrapperPlayServerSpawnEntityLiving() {
        super(new PacketContainer(WrapperPlayServerSpawnEntityLiving.TYPE), WrapperPlayServerSpawnEntityLiving.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSpawnEntityLiving(final PacketContainer packet) {
        super(packet, WrapperPlayServerSpawnEntityLiving.TYPE);
    }
    
    public WrapperPlayServerSpawnEntityLiving(final Entity entity) {
        super(fromEntity(entity), WrapperPlayServerSpawnEntityLiving.TYPE);
    }
    
    private static PacketContainer fromEntity(final Entity entity) {
        if (WrapperPlayServerSpawnEntityLiving.entityConstructor == null) {
            WrapperPlayServerSpawnEntityLiving.entityConstructor = ProtocolLibrary.getProtocolManager().createPacketConstructor(WrapperPlayServerSpawnEntityLiving.TYPE, entity);
        }
        return WrapperPlayServerSpawnEntityLiving.entityConstructor.createPacket(entity);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(0);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(0);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public UUID getUniqueId() {
        return this.handle.getUUIDs().read(0);
    }
    
    public void setUniqueId(final UUID value) {
        this.handle.getUUIDs().write(0, value);
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public EntityType getType() {
        return EntityType.fromId(this.handle.getIntegers().read(1));
    }
    
    public void setType(final EntityType value) {
        this.handle.getIntegers().write(1, (int)value.getTypeId());
    }
    
    public double getX() {
        return this.handle.getDoubles().read(0);
    }
    
    public void setX(final double value) {
        this.handle.getDoubles().write(0, value);
    }
    
    public double getY() {
        return this.handle.getDoubles().read(1);
    }
    
    public void setY(final double value) {
        this.handle.getDoubles().write(1, value);
    }
    
    public double getZ() {
        return this.handle.getDoubles().read(2);
    }
    
    public void setZ(final double value) {
        this.handle.getDoubles().write(2, value);
    }
    
    public float getYaw() {
        return this.handle.getBytes().read(0) * 360.0f / 256.0f;
    }
    
    public void setYaw(final float value) {
        this.handle.getBytes().write(0, (byte)(value * 256.0f / 360.0f));
    }
    
    public float getPitch() {
        return this.handle.getBytes().read(1) * 360.0f / 256.0f;
    }
    
    public void setPitch(final float value) {
        this.handle.getBytes().write(1, (byte)(value * 256.0f / 360.0f));
    }
    
    public float getHeadPitch() {
        return this.handle.getBytes().read(2) * 360.0f / 256.0f;
    }
    
    public void setHeadPitch(final float value) {
        this.handle.getBytes().write(2, (byte)(value * 256.0f / 360.0f));
    }
    
    public double getVelocityX() {
        return this.handle.getIntegers().read(2) / 8000.0;
    }
    
    public void setVelocityX(final double value) {
        this.handle.getIntegers().write(2, (int)(value * 8000.0));
    }
    
    public double getVelocityY() {
        return this.handle.getIntegers().read(3) / 8000.0;
    }
    
    public void setVelocityY(final double value) {
        this.handle.getIntegers().write(3, (int)(value * 8000.0));
    }
    
    public double getVelocityZ() {
        return this.handle.getIntegers().read(4) / 8000.0;
    }
    
    public void setVelocityZ(final double value) {
        this.handle.getIntegers().write(4, (int)(value * 8000.0));
    }
    
    public WrappedDataWatcher getMetadata() {
        return this.handle.getDataWatcherModifier().read(0);
    }
    
    public void setMetadata(final WrappedDataWatcher value) {
        this.handle.getDataWatcherModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SPAWN_ENTITY_LIVING;
    }
}
