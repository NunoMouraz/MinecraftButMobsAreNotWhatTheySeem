// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientPickItem extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientPickItem() {
        super(new PacketContainer(WrapperPlayClientPickItem.TYPE), WrapperPlayClientPickItem.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientPickItem(final PacketContainer packet) {
        super(packet, WrapperPlayClientPickItem.TYPE);
    }
    
    public int getSlotToUse() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setSlotToUse(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.PICK_ITEM;
    }
}
