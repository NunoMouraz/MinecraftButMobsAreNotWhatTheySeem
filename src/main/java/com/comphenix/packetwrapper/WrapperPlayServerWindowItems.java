// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.inventory.ItemStack;
import java.util.List;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerWindowItems extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerWindowItems() {
        super(new PacketContainer(WrapperPlayServerWindowItems.TYPE), WrapperPlayServerWindowItems.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerWindowItems(final PacketContainer packet) {
        super(packet, WrapperPlayServerWindowItems.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public List<ItemStack> getSlotData() {
        return this.handle.getItemListModifier().read(0);
    }
    
    public void setSlotData(final List<ItemStack> value) {
        this.handle.getItemListModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.WINDOW_ITEMS;
    }
}
