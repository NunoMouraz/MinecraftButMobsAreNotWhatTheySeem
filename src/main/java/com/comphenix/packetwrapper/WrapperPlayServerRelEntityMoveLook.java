// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerRelEntityMoveLook extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerRelEntityMoveLook() {
        super(new PacketContainer(WrapperPlayServerRelEntityMoveLook.TYPE), WrapperPlayServerRelEntityMoveLook.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRelEntityMoveLook(final PacketContainer packet) {
        super(packet, WrapperPlayServerRelEntityMoveLook.TYPE);
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
    
    public double getDx() {
        return this.handle.getIntegers().read(1) / 4096.0;
    }
    
    public void setDx(final double value) {
        this.handle.getIntegers().write(1, (int)(value * 4096.0));
    }
    
    public double getDy() {
        return this.handle.getIntegers().read(2) / 4096.0;
    }
    
    public void setDy(final double value) {
        this.handle.getIntegers().write(2, (int)(value * 4096.0));
    }
    
    public double getDz() {
        return this.handle.getIntegers().read(3) / 4096.0;
    }
    
    public void setDz(final double value) {
        this.handle.getIntegers().write(3, (int)(value * 4096.0));
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
        TYPE = PacketType.Play.Server.REL_ENTITY_MOVE_LOOK;
    }
}
