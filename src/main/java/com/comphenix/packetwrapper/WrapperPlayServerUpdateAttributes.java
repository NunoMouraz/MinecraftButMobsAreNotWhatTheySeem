// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedAttribute;
import java.util.List;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerUpdateAttributes extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerUpdateAttributes() {
        super(new PacketContainer(WrapperPlayServerUpdateAttributes.TYPE), WrapperPlayServerUpdateAttributes.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerUpdateAttributes(final PacketContainer packet) {
        super(packet, WrapperPlayServerUpdateAttributes.TYPE);
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
    
    public List<WrappedAttribute> getAttributes() {
        return this.handle.getAttributeCollectionModifier().read(0);
    }
    
    public void setAttributes(final List<WrappedAttribute> value) {
        this.handle.getAttributeCollectionModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.UPDATE_ATTRIBUTES;
    }
}
