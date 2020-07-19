// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientHeldItemSlot extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientHeldItemSlot() {
        super(new PacketContainer(WrapperPlayClientHeldItemSlot.TYPE), WrapperPlayClientHeldItemSlot.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientHeldItemSlot(final PacketContainer packet) {
        super(packet, WrapperPlayClientHeldItemSlot.TYPE);
    }
    
    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setSlot(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.HELD_ITEM_SLOT;
    }
}
