// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.inventory.ItemStack;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientWindowClick extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientWindowClick() {
        super(new PacketContainer(WrapperPlayClientWindowClick.TYPE), WrapperPlayClientWindowClick.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientWindowClick(final PacketContainer packet) {
        super(packet, WrapperPlayClientWindowClick.TYPE);
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
    
    public int getButton() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setButton(final int value) {
        this.handle.getIntegers().write(2, value);
    }
    
    public short getActionNumber() {
        return this.handle.getShorts().read(0);
    }
    
    public void setActionNumber(final short value) {
        this.handle.getShorts().write(0, value);
    }
    
    public ItemStack getClickedItem() {
        return this.handle.getItemModifier().read(0);
    }
    
    public void setClickedItem(final ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }
    
    public InventoryClickType getShift() {
        return (InventoryClickType)this.handle.getEnumModifier((Class)InventoryClickType.class, 5).read(0);
    }
    
    public void setShift(final InventoryClickType value) {
        this.handle.getEnumModifier((Class)InventoryClickType.class, 5).write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.WINDOW_CLICK;
    }
    
    public enum InventoryClickType
    {
        PICKUP, 
        QUICK_MOVE, 
        SWAP, 
        CLONE, 
        THROW, 
        QUICK_CRAFT, 
        PICKUP_ALL
    }
}
