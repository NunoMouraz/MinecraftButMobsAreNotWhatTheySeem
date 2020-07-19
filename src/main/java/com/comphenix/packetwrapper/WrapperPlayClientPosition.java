// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientPosition extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientPosition() {
        super(new PacketContainer(WrapperPlayClientPosition.TYPE), WrapperPlayClientPosition.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientPosition(final PacketContainer packet) {
        super(packet, WrapperPlayClientPosition.TYPE);
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
    
    public boolean getOnGround() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setOnGround(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.POSITION;
    }
}
