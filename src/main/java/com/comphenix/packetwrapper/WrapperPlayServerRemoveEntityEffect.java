// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.potion.PotionEffectType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerRemoveEntityEffect extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerRemoveEntityEffect() {
        super(new PacketContainer(WrapperPlayServerRemoveEntityEffect.TYPE), WrapperPlayServerRemoveEntityEffect.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRemoveEntityEffect(final PacketContainer packet) {
        super(packet, WrapperPlayServerRemoveEntityEffect.TYPE);
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
    
    public PotionEffectType getEffect() {
        return this.handle.getEffectTypes().read(0);
    }
    
    public void setEffect(final PotionEffectType value) {
        this.handle.getEffectTypes().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.REMOVE_ENTITY_EFFECT;
    }
}
