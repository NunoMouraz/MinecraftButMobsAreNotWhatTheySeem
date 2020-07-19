// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientEntityAction extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientEntityAction() {
        super(new PacketContainer(WrapperPlayClientEntityAction.TYPE), WrapperPlayClientEntityAction.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientEntityAction(final PacketContainer packet) {
        super(packet, WrapperPlayClientEntityAction.TYPE);
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
    
    public EnumWrappers.PlayerAction getAction() {
        return this.handle.getPlayerActions().read(0);
    }
    
    public void setAction(final EnumWrappers.PlayerAction value) {
        this.handle.getPlayerActions().write(0, value);
    }
    
    public int getJumpBoost() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setJumpBoost(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.ENTITY_ACTION;
    }
}
