// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerOpenWindow extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerOpenWindow() {
        super(new PacketContainer(WrapperPlayServerOpenWindow.TYPE), WrapperPlayServerOpenWindow.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerOpenWindow(final PacketContainer packet) {
        super(packet, WrapperPlayServerOpenWindow.TYPE);
    }
    
    public int getWindowID() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public String getInventoryType() {
        return this.handle.getStrings().read(0);
    }
    
    public void setInventoryType(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public WrappedChatComponent getWindowTitle() {
        return this.handle.getChatComponents().read(0);
    }
    
    public void setWindowTitle(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    public int getNumberOfSlots() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setNumberOfSlots(final int value) {
        this.handle.getIntegers().write(1, value);
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
    
    static {
        TYPE = PacketType.Play.Server.OPEN_WINDOW;
    }
}
