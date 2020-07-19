// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientUpdateSign extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientUpdateSign() {
        super(new PacketContainer(WrapperPlayClientUpdateSign.TYPE), WrapperPlayClientUpdateSign.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientUpdateSign(final PacketContainer packet) {
        super(packet, WrapperPlayClientUpdateSign.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public String[] getLines() {
        return this.handle.getStringArrays().read(0);
    }
    
    public void setLines(final String[] value) {
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null!");
        }
        if (value.length != 4) {
            throw new IllegalArgumentException("value must have 4 elements!");
        }
        this.handle.getStringArrays().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.UPDATE_SIGN;
    }
}
