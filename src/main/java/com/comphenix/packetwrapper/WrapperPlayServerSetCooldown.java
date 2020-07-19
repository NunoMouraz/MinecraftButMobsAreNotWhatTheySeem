// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.reflect.accessors.Accessors;
import com.comphenix.protocol.reflect.accessors.MethodAccessor;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.reflect.EquivalentConverter;
import org.bukkit.Material;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerSetCooldown extends AbstractPacket
{
    private static final Class<?> ITEM_CLASS;
    public static final PacketType TYPE;
    
    public WrapperPlayServerSetCooldown() {
        super(new PacketContainer(WrapperPlayServerSetCooldown.TYPE), WrapperPlayServerSetCooldown.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSetCooldown(final PacketContainer packet) {
        super(packet, WrapperPlayServerSetCooldown.TYPE);
    }
    
    public Material getItem() {
        return (Material)this.handle.getModifier().withType(WrapperPlayServerSetCooldown.ITEM_CLASS, (EquivalentConverter)new ItemConverter()).read(0);
    }
    
    public void setItem(final Material value) {
        this.handle.getModifier().withType(WrapperPlayServerSetCooldown.ITEM_CLASS, (EquivalentConverter)new ItemConverter()).write(0, value);
    }
    
    public int getTicks() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTicks(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        ITEM_CLASS = MinecraftReflection.getMinecraftClass("Item");
        TYPE = PacketType.Play.Server.SET_COOLDOWN;
    }
    
    private static class ItemConverter implements EquivalentConverter<Material>
    {
        private static MethodAccessor getMaterial;
        private static MethodAccessor getItem;
        
        public Material getSpecific(final Object generic) {
            if (ItemConverter.getMaterial == null) {
                ItemConverter.getMaterial = Accessors.getMethodAccessor(MinecraftReflection.getCraftBukkitClass("util.CraftMagicNumbers"), "getMaterial", WrapperPlayServerSetCooldown.ITEM_CLASS);
            }
            return (Material)ItemConverter.getMaterial.invoke(null, new Object[] { generic });
        }
        
        public Object getGeneric(final Material specific) {
            if (ItemConverter.getItem == null) {
                ItemConverter.getItem = Accessors.getMethodAccessor(MinecraftReflection.getCraftBukkitClass("util.CraftMagicNumbers"), "getItem", Material.class);
            }
            return ItemConverter.getItem.invoke(null, specific);
        }
        
        public Class<Material> getSpecificType() {
            return Material.class;
        }
        
        static {
            ItemConverter.getMaterial = null;
            ItemConverter.getItem = null;
        }
    }
}
