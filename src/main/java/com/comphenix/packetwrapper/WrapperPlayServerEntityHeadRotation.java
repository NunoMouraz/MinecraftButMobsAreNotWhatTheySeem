// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityHeadRotation extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityHeadRotation() {
        super(new PacketContainer(WrapperPlayServerEntityHeadRotation.TYPE), WrapperPlayServerEntityHeadRotation.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityHeadRotation(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityHeadRotation.TYPE);
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
    
    public byte getHeadYaw() {
        return this.handle.getBytes().read(0);
    }
    
    public void setHeadYaw(final byte value) {
        this.handle.getBytes().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.ENTITY_HEAD_ROTATION;
    }
}
