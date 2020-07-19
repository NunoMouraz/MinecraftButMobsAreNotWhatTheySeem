// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityLook extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityLook() {
        super(new PacketContainer(WrapperPlayServerEntityLook.TYPE), WrapperPlayServerEntityLook.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityLook(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityLook.TYPE);
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
        TYPE = PacketType.Play.Server.ENTITY_LOOK;
    }
}
