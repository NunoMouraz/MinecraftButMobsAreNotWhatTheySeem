// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerLookAt extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerLookAt() {
        super(new PacketContainer(WrapperPlayServerLookAt.TYPE), WrapperPlayServerLookAt.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerLookAt(final PacketContainer packet) {
        super(packet, WrapperPlayServerLookAt.TYPE);
    }
    
    public Anchor getAnchor() {
        return (Anchor)this.handle.getEnumModifier((Class)Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor")).readSafely(0);
    }
    
    public void setAnchor(final Anchor value) {
        this.handle.getEnumModifier((Class)Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor")).writeSafely(0, value);
    }
    
    public double getTargetX() {
        return this.handle.getDoubles().read(0);
    }
    
    public void setTargetX(final double value) {
        this.handle.getDoubles().write(0, value);
    }
    
    public double getTargetY() {
        return this.handle.getDoubles().read(1);
    }
    
    public void setTargetY(final double value) {
        this.handle.getDoubles().write(1, value);
    }
    
    public double getTargetZ() {
        return this.handle.getDoubles().read(2);
    }
    
    public void setTargetZ(final double value) {
        this.handle.getDoubles().write(2, value);
    }
    
    public boolean getIsEntity() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setIsEntity(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(6);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public Anchor getEntityAnchor() {
        return (Anchor)this.handle.getEnumModifier((Class)Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor")).readSafely(1);
    }
    
    public void setEntityAnchor(final Anchor value) {
        this.handle.getEnumModifier((Class)Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor")).writeSafely(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.LOOK_AT;
    }
    
    public enum Anchor
    {
        FEET, 
        EYES
    }
}
