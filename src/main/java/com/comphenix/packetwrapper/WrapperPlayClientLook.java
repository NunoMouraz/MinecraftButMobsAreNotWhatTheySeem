// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientLook extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientLook() {
        super(new PacketContainer(WrapperPlayClientLook.TYPE), WrapperPlayClientLook.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientLook(final PacketContainer packet) {
        super(packet, WrapperPlayClientLook.TYPE);
    }
    
    public float getYaw() {
        return this.handle.getFloat().read(0);
    }
    
    public void setYaw(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getPitch() {
        return this.handle.getFloat().read(1);
    }
    
    public void setPitch(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    public boolean getOnGround() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setOnGround(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.LOOK;
    }
}
