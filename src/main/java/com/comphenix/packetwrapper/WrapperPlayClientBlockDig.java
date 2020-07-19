// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientBlockDig extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientBlockDig() {
        super(new PacketContainer(WrapperPlayClientBlockDig.TYPE), WrapperPlayClientBlockDig.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBlockDig(final PacketContainer packet) {
        super(packet, WrapperPlayClientBlockDig.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public EnumWrappers.Direction getDirection() {
        return this.handle.getDirections().read(0);
    }
    
    public void setDirection(final EnumWrappers.Direction value) {
        this.handle.getDirections().write(0, value);
    }
    
    public EnumWrappers.PlayerDigType getStatus() {
        return this.handle.getPlayerDigTypes().read(0);
    }
    
    public void setStatus(final EnumWrappers.PlayerDigType value) {
        this.handle.getPlayerDigTypes().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.BLOCK_DIG;
    }
}
