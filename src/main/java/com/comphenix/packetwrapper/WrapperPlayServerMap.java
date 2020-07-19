// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerMap extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerMap() {
        super(new PacketContainer(WrapperPlayServerMap.TYPE), WrapperPlayServerMap.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerMap(final PacketContainer packet) {
        super(packet, WrapperPlayServerMap.TYPE);
    }
    
    public int getItemDamage() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setItemDamage(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public byte getScale() {
        return this.handle.getBytes().read(0);
    }
    
    public void setScale(final byte value) {
        this.handle.getBytes().write(0, value);
    }
    
    public boolean getTrackingPosition() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setTrackingPosition(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public Object[] getMapIcons() {
        return (Object[])this.handle.getModifier().read(3);
    }
    
    public void setMapIcons(final Object[] value) {
        this.handle.getModifier().write(3, value);
    }
    
    public int getColumns() {
        return this.handle.getIntegers().read(3);
    }
    
    public void setColumns(final int value) {
        this.handle.getIntegers().write(3, value);
    }
    
    public int getRows() {
        return this.handle.getIntegers().read(4);
    }
    
    public void setRows(final int value) {
        this.handle.getIntegers().write(4, value);
    }
    
    public int getX() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setX(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public int getZ() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setZ(final int value) {
        this.handle.getIntegers().write(2, value);
    }
    
    public byte[] getData() {
        return this.handle.getByteArrays().read(0);
    }
    
    public void setData(final byte[] value) {
        this.handle.getByteArrays().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.MAP;
    }
}
