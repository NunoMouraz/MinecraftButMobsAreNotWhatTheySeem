// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.inventory.ItemStack;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerSetSlot extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerSetSlot() {
        super(new PacketContainer(WrapperPlayServerSetSlot.TYPE), WrapperPlayServerSetSlot.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSetSlot(final PacketContainer packet) {
        super(packet, WrapperPlayServerSetSlot.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getSlot() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setSlot(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public ItemStack getSlotData() {
        return this.handle.getItemModifier().read(0);
    }
    
    public void setSlotData(final ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SET_SLOT;
    }
}
