// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntity extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntity() {
        super(new PacketContainer(WrapperPlayServerEntity.TYPE), WrapperPlayServerEntity.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntity(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntity.TYPE);
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
    
    static {
        TYPE = PacketType.Play.Server.ENTITY;
    }
}
