// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientUseItem extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientUseItem() {
        super(new PacketContainer(WrapperPlayClientUseItem.TYPE), WrapperPlayClientUseItem.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientUseItem(final PacketContainer packet) {
        super(packet, WrapperPlayClientUseItem.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public EnumWrappers.Direction getFace() {
        return this.handle.getDirections().read(0);
    }
    
    public void setFace(final EnumWrappers.Direction value) {
        this.handle.getDirections().write(0, value);
    }
    
    public EnumWrappers.Hand getHand() {
        return this.handle.getHands().read(0);
    }
    
    public void setHand(final EnumWrappers.Hand value) {
        this.handle.getHands().write(0, value);
    }
    
    public float getCursorPositionX() {
        return this.handle.getFloat().read(0);
    }
    
    public void setCursorPositionX(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getCursorPositionY() {
        return this.handle.getFloat().read(1);
    }
    
    public void setCursorPositionY(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    public float getCursorPositionZ() {
        return this.handle.getFloat().read(2);
    }
    
    public void setCursorPositionZ(final float value) {
        this.handle.getFloat().write(2, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.USE_ITEM;
    }
}
