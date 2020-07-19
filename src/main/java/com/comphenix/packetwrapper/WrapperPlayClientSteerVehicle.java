// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientSteerVehicle extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientSteerVehicle() {
        super(new PacketContainer(WrapperPlayClientSteerVehicle.TYPE), WrapperPlayClientSteerVehicle.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSteerVehicle(final PacketContainer packet) {
        super(packet, WrapperPlayClientSteerVehicle.TYPE);
    }
    
    public float getSideways() {
        return this.handle.getFloat().read(0);
    }
    
    public void setSideways(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getForward() {
        return this.handle.getFloat().read(1);
    }
    
    public void setForward(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    public boolean isJump() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setJump(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public boolean isUnmount() {
        return this.handle.getBooleans().read(1);
    }
    
    public void setUnmount(final boolean value) {
        this.handle.getBooleans().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.STEER_VEHICLE;
    }
}
