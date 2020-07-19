// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerSpawnEntityWeather extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerSpawnEntityWeather() {
        super(new PacketContainer(WrapperPlayServerSpawnEntityWeather.TYPE), WrapperPlayServerSpawnEntityWeather.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSpawnEntityWeather(final PacketContainer packet) {
        super(packet, WrapperPlayServerSpawnEntityWeather.TYPE);
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
    
    public int getType() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setType(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public double getX() {
        return this.handle.getDoubles().read(0);
    }
    
    public void setX(final double value) {
        this.handle.getDoubles().write(0, value);
    }
    
    public double getY() {
        return this.handle.getDoubles().read(1);
    }
    
    public void setY(final double value) {
        this.handle.getDoubles().write(1, value);
    }
    
    public double getZ() {
        return this.handle.getDoubles().read(2);
    }
    
    public void setZ(final double value) {
        this.handle.getDoubles().write(2, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SPAWN_ENTITY_WEATHER;
    }
}
