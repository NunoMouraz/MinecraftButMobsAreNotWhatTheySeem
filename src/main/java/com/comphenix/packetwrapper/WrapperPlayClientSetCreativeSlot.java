// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.inventory.ItemStack;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientSetCreativeSlot extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientSetCreativeSlot() {
        super(new PacketContainer(WrapperPlayClientSetCreativeSlot.TYPE), WrapperPlayClientSetCreativeSlot.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSetCreativeSlot(final PacketContainer packet) {
        super(packet, WrapperPlayClientSetCreativeSlot.TYPE);
    }
    
    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setSlot(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public ItemStack getClickedItem() {
        return this.handle.getItemModifier().read(0);
    }
    
    public void setClickedItem(final ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.SET_CREATIVE_SLOT;
    }
}
