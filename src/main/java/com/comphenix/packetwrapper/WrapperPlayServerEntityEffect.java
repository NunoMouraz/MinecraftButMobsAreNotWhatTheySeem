// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityEffect extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityEffect() {
        super(new PacketContainer(WrapperPlayServerEntityEffect.TYPE), WrapperPlayServerEntityEffect.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityEffect(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityEffect.TYPE);
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
    
    public byte getEffectID() {
        return this.handle.getBytes().read(0);
    }
    
    public void setEffectID(final byte value) {
        this.handle.getBytes().write(0, (byte)(value & 0xFF));
    }
    
    public byte getAmplifier() {
        return this.handle.getBytes().read(1);
    }
    
    public void setAmplifier(final byte value) {
        this.handle.getBytes().write(1, (byte)(value & 0xFF));
    }
    
    public int getDuration() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setDuration(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public boolean getHideParticles() {
        return this.handle.getBytes().read(2) == 0;
    }
    
    public void setHideParticles(final boolean value) {
        this.handle.getBytes().write(2, (byte)(value ? 0 : 1));
    }
    
    static {
        TYPE = PacketType.Play.Server.ENTITY_EFFECT;
    }
}
