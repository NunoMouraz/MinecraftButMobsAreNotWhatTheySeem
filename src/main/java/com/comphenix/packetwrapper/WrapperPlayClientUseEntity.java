// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.util.Vector;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientUseEntity extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientUseEntity() {
        super(new PacketContainer(WrapperPlayClientUseEntity.TYPE), WrapperPlayClientUseEntity.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientUseEntity(final PacketContainer packet) {
        super(packet, WrapperPlayClientUseEntity.TYPE);
    }
    
    public int getTargetID() {
        return this.handle.getIntegers().read(0);
    }
    
    public Entity getTarget(final World world) {
        return this.handle.getEntityModifier(world).read(0);
    }
    
    public Entity getTarget(final PacketEvent event) {
        return this.getTarget(event.getPlayer().getWorld());
    }
    
    public void setTargetID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public EnumWrappers.EntityUseAction getType() {
        return this.handle.getEntityUseActions().read(0);
    }
    
    public void setType(final EnumWrappers.EntityUseAction value) {
        this.handle.getEntityUseActions().write(0, value);
    }
    
    public Vector getTargetVector() {
        return this.handle.getVectors().read(0);
    }
    
    public void setTargetVector(final Vector value) {
        this.handle.getVectors().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.USE_ENTITY;
    }
}
