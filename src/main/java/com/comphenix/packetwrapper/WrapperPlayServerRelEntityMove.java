// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerRelEntityMove extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerRelEntityMove() {
        super(new PacketContainer(WrapperPlayServerRelEntityMove.TYPE), WrapperPlayServerRelEntityMove.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRelEntityMove(final PacketContainer packet) {
        super(packet, WrapperPlayServerRelEntityMove.TYPE);
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
    
    public int getDx() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setDx(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public int getDy() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setDy(final int value) {
        this.handle.getIntegers().write(2, value);
    }
    
    public int getDz() {
        return this.handle.getIntegers().read(3);
    }
    
    public void setDz(final int value) {
        this.handle.getIntegers().write(3, value);
    }
    
    public boolean getOnGround() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setOnGround(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.REL_ENTITY_MOVE;
    }
}
