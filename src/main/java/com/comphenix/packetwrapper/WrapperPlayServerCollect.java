// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerCollect extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerCollect() {
        super(new PacketContainer(WrapperPlayServerCollect.TYPE), WrapperPlayServerCollect.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCollect(final PacketContainer packet) {
        super(packet, WrapperPlayServerCollect.TYPE);
    }
    
    public int getCollectedEntityId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setCollectedEntityId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getCollectorEntityId() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setCollectorEntityId(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.COLLECT;
    }
}
