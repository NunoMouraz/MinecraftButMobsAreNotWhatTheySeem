// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientBlockPlace extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientBlockPlace() {
        super(new PacketContainer(WrapperPlayClientBlockPlace.TYPE), WrapperPlayClientBlockPlace.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBlockPlace(final PacketContainer packet) {
        super(packet, WrapperPlayClientBlockPlace.TYPE);
    }
    
    public EnumWrappers.Hand getHand() {
        return this.handle.getHands().read(0);
    }
    
    public void setHand(final EnumWrappers.Hand value) {
        this.handle.getHands().write(0, value);
    }
    
    public long getTimestamp() {
        return this.handle.getLongs().read(0);
    }
    
    public void setTimestamp(final long value) {
        this.handle.getLongs().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.BLOCK_PLACE;
    }
}
