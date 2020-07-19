// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedDataWatcher;
import org.bukkit.util.Vector;
import java.util.UUID;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerNamedEntitySpawn extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerNamedEntitySpawn() {
        super(new PacketContainer(WrapperPlayServerNamedEntitySpawn.TYPE), WrapperPlayServerNamedEntitySpawn.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerNamedEntitySpawn(final PacketContainer packet) {
        super(packet, WrapperPlayServerNamedEntitySpawn.TYPE);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(0);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public UUID getPlayerUUID() {
        return this.handle.getUUIDs().read(0);
    }
    
    public void setPlayerUUID(final UUID value) {
        this.handle.getUUIDs().write(0, value);
    }
    
    public Vector getPosition() {
        return new Vector(this.getX(), this.getY(), this.getZ());
    }
    
    public void setPosition(final Vector position) {
        this.setX(position.getX());
        this.setY(position.getY());
        this.setZ(position.getZ());
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
    
    public WrappedDataWatcher getMetadata() {
        return this.handle.getDataWatcherModifier().read(0);
    }
    
    public void setMetadata(final WrappedDataWatcher value) {
        this.handle.getDataWatcherModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.NAMED_ENTITY_SPAWN;
    }
}
