// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityStatus extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityStatus() {
        super(new PacketContainer(WrapperPlayServerEntityStatus.TYPE), WrapperPlayServerEntityStatus.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityStatus(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityStatus.TYPE);
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
    
    public byte getEntityStatus() {
        return this.handle.getBytes().read(0);
    }
    
    public void setEntityStatus(final byte value) {
        this.handle.getBytes().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.ENTITY_STATUS;
    }
}
