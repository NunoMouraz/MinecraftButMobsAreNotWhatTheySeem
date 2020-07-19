// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityTeleport extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityTeleport() {
        super(new PacketContainer(WrapperPlayServerEntityTeleport.TYPE), WrapperPlayServerEntityTeleport.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityTeleport(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityTeleport.TYPE);
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
    
    public boolean getOnGround() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setOnGround(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.ENTITY_TELEPORT;
    }
}
