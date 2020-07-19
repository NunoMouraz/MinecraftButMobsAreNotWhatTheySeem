// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerWindowData extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerWindowData() {
        super(new PacketContainer(WrapperPlayServerWindowData.TYPE), WrapperPlayServerWindowData.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerWindowData(final PacketContainer packet) {
        super(packet, WrapperPlayServerWindowData.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getProperty() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setProperty(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public int getValue() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setValue(final int value) {
        this.handle.getIntegers().write(2, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.WINDOW_DATA;
    }
}
