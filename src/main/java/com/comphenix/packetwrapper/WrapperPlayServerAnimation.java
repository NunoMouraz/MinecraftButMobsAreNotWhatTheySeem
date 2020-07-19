// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerAnimation extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerAnimation() {
        super(new PacketContainer(WrapperPlayServerAnimation.TYPE), WrapperPlayServerAnimation.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAnimation(final PacketContainer packet) {
        super(packet, WrapperPlayServerAnimation.TYPE);
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
    
    public int getAnimation() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setAnimation(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.ANIMATION;
    }
}
