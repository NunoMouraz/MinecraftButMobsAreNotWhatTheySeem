// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerVehicleMove extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerVehicleMove() {
        super(new PacketContainer(WrapperPlayServerVehicleMove.TYPE), WrapperPlayServerVehicleMove.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerVehicleMove(final PacketContainer packet) {
        super(packet, WrapperPlayServerVehicleMove.TYPE);
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
    
    static {
        TYPE = PacketType.Play.Server.VEHICLE_MOVE;
    }
}
