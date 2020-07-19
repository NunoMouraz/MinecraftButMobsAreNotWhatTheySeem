// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerBlockBreakAnimation extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerBlockBreakAnimation() {
        super(new PacketContainer(WrapperPlayServerBlockBreakAnimation.TYPE), WrapperPlayServerBlockBreakAnimation.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerBlockBreakAnimation(final PacketContainer packet) {
        super(packet, WrapperPlayServerBlockBreakAnimation.TYPE);
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
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public int getDestroyStage() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setDestroyStage(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.BLOCK_BREAK_ANIMATION;
    }
}
