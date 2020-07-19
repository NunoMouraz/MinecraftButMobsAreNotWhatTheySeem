// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerHeldItemSlot extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerHeldItemSlot() {
        super(new PacketContainer(WrapperPlayServerHeldItemSlot.TYPE), WrapperPlayServerHeldItemSlot.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerHeldItemSlot(final PacketContainer packet) {
        super(packet, WrapperPlayServerHeldItemSlot.TYPE);
    }
    
    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setSlot(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.HELD_ITEM_SLOT;
    }
}
