// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerWorldEvent extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerWorldEvent() {
        super(new PacketContainer(WrapperPlayServerWorldEvent.TYPE), WrapperPlayServerWorldEvent.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerWorldEvent(final PacketContainer packet) {
        super(packet, WrapperPlayServerWorldEvent.TYPE);
    }
    
    public int getEffectId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setEffectId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public int getData() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setData(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public boolean getDisableRelativeVolume() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setDisableRelativeVolume(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.WORLD_EVENT;
    }
}
