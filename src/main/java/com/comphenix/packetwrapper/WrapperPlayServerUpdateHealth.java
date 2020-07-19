// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerUpdateHealth extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerUpdateHealth() {
        super(new PacketContainer(WrapperPlayServerUpdateHealth.TYPE), WrapperPlayServerUpdateHealth.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerUpdateHealth(final PacketContainer packet) {
        super(packet, WrapperPlayServerUpdateHealth.TYPE);
    }
    
    public float getHealth() {
        return this.handle.getFloat().read(0);
    }
    
    public void setHealth(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public int getFood() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setFood(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public float getFoodSaturation() {
        return this.handle.getFloat().read(1);
    }
    
    public void setFoodSaturation(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.UPDATE_HEALTH;
    }
}
