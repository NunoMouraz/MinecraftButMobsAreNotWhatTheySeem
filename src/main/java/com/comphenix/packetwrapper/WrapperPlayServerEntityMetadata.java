// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedWatchableObject;
import java.util.List;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityMetadata extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityMetadata() {
        super(new PacketContainer(WrapperPlayServerEntityMetadata.TYPE), WrapperPlayServerEntityMetadata.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityMetadata(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityMetadata.TYPE);
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
    
    public List<WrappedWatchableObject> getMetadata() {
        return this.handle.getWatchableCollectionModifier().read(0);
    }
    
    public void setMetadata(final List<WrappedWatchableObject> value) {
        this.handle.getWatchableCollectionModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.ENTITY_METADATA;
    }
}
