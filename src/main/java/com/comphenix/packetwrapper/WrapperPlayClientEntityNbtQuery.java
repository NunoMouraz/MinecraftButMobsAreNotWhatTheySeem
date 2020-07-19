// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientEntityNbtQuery extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientEntityNbtQuery() {
        super(new PacketContainer(WrapperPlayClientEntityNbtQuery.TYPE), WrapperPlayClientEntityNbtQuery.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientEntityNbtQuery(final PacketContainer packet) {
        super(packet, WrapperPlayClientEntityNbtQuery.TYPE);
    }
    
    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTransactionId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(1);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(1);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.ENTITY_NBT_QUERY;
    }
}
