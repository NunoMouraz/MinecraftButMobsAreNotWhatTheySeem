// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.inventory.ItemStack;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityEquipment extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityEquipment() {
        super(new PacketContainer(WrapperPlayServerEntityEquipment.TYPE), WrapperPlayServerEntityEquipment.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityEquipment(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityEquipment.TYPE);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(0);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public EnumWrappers.ItemSlot getSlot() {
        return this.handle.getItemSlots().read(0);
    }
    
    public void setSlot(final EnumWrappers.ItemSlot value) {
        this.handle.getItemSlots().write(0, value);
    }
    
    public ItemStack getItem() {
        return this.handle.getItemModifier().read(0);
    }
    
    public void setItem(final ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.ENTITY_EQUIPMENT;
    }
}
