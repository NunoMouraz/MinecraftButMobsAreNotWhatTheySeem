// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.ProtocolLibrary;
import java.util.ArrayList;
import java.util.List;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerMount extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerMount() {
        super(new PacketContainer(WrapperPlayServerMount.TYPE), WrapperPlayServerMount.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerMount(final PacketContainer packet) {
        super(packet, WrapperPlayServerMount.TYPE);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(0);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(0);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int[] getPassengerIds() {
        return this.handle.getIntegerArrays().read(0);
    }
    
    public void setPassengerIds(final int[] value) {
        this.handle.getIntegerArrays().write(0, value);
    }
    
    public List<Entity> getPassengers(final PacketEvent event) {
        return this.getPassengers(event.getPlayer().getWorld());
    }
    
    public List<Entity> getPassengers(final World world) {
        final int[] ids = this.getPassengerIds();
        final List<Entity> passengers = new ArrayList<Entity>();
        final ProtocolManager manager = ProtocolLibrary.getProtocolManager();
        for (final int id : ids) {
            final Entity entity = manager.getEntityFromID(world, id);
            if (entity != null) {
                passengers.add(entity);
            }
        }
        return passengers;
    }
    
    public void setPassengers(final List<Entity> value) {
        final int[] array = new int[value.size()];
        for (int i = 0; i < value.size(); ++i) {
            array[i] = value.get(i).getEntityId();
        }
        this.setPassengerIds(array);
    }
    
    static {
        TYPE = PacketType.Play.Server.MOUNT;
    }
}
