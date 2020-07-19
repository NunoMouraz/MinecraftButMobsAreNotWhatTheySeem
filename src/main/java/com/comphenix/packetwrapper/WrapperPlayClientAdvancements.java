// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientAdvancements extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientAdvancements() {
        super(new PacketContainer(WrapperPlayClientAdvancements.TYPE), WrapperPlayClientAdvancements.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientAdvancements(final PacketContainer packet) {
        super(packet, WrapperPlayClientAdvancements.TYPE);
    }
    
    public Status getAction() {
        return (Status)this.handle.getEnumModifier((Class)Status.class, 0).readSafely(0);
    }
    
    public void setAction(final Status value) {
        this.handle.getEnumModifier((Class)Status.class, 0).writeSafely(0, value);
    }
    
    public MinecraftKey getTabId() {
        return this.handle.getMinecraftKeys().readSafely(0);
    }
    
    public void setTabId(final MinecraftKey value) {
        this.handle.getMinecraftKeys().writeSafely(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.ADVANCEMENTS;
    }
    
    public enum Status
    {
        OPENED_TAB, 
        CLOSED_SCREEN
    }
}
