// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerGameStateChange extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerGameStateChange() {
        super(new PacketContainer(WrapperPlayServerGameStateChange.TYPE), WrapperPlayServerGameStateChange.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerGameStateChange(final PacketContainer packet) {
        super(packet, WrapperPlayServerGameStateChange.TYPE);
    }
    
    public int getReason() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setReason(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public float getValue() {
        return this.handle.getFloat().read(0);
    }
    
    public void setValue(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.GAME_STATE_CHANGE;
    }
}
