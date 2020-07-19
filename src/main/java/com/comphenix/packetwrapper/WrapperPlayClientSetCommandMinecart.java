// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientSetCommandMinecart extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientSetCommandMinecart() {
        super(new PacketContainer(WrapperPlayClientSetCommandMinecart.TYPE), WrapperPlayClientSetCommandMinecart.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSetCommandMinecart(final PacketContainer packet) {
        super(packet, WrapperPlayClientSetCommandMinecart.TYPE);
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
    
    public String getCommand() {
        return this.handle.getStrings().read(0);
    }
    
    public void setCommand(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public boolean getTrackOutput() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setTrackOutput(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.SET_COMMAND_MINECART;
    }
}
