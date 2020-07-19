// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientRecipeDisplayed extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientRecipeDisplayed() {
        super(new PacketContainer(WrapperPlayClientRecipeDisplayed.TYPE), WrapperPlayClientRecipeDisplayed.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientRecipeDisplayed(final PacketContainer packet) {
        super(packet, WrapperPlayClientRecipeDisplayed.TYPE);
    }
    
    public Status getStatus() {
        return (Status)this.handle.getEnumModifier((Class)Status.class, 0).readSafely(0);
    }
    
    public void setStatus(final Status value) {
        this.handle.getEnumModifier((Class)Status.class, 0).writeSafely(0, value);
    }
    
    public boolean isBookOpen() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setBookOpen(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public boolean isFilterActive() {
        return this.handle.getBooleans().read(1);
    }
    
    public void setFilterActive(final boolean value) {
        this.handle.getBooleans().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.RECIPE_DISPLAYED;
    }
    
    public enum Status
    {
        SHOWN, 
        SETTINGS
    }
}
