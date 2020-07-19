// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientEnchantItem extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientEnchantItem() {
        super(new PacketContainer(WrapperPlayClientEnchantItem.TYPE), WrapperPlayClientEnchantItem.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientEnchantItem(final PacketContainer packet) {
        super(packet, WrapperPlayClientEnchantItem.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final byte value) {
        this.handle.getIntegers().write(0, (int)value);
    }
    
    public int getEnchantment() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setEnchantment(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.ENCHANT_ITEM;
    }
}
