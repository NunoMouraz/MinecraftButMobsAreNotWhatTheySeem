// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientSettings extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientSettings() {
        super(new PacketContainer(WrapperPlayClientSettings.TYPE), WrapperPlayClientSettings.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSettings(final PacketContainer packet) {
        super(packet, WrapperPlayClientSettings.TYPE);
    }
    
    public String getLocale() {
        return this.handle.getStrings().read(0);
    }
    
    public void setLocale(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public int getViewDistance() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setViewDistance(final byte value) {
        this.handle.getIntegers().write(0, (int)value);
    }
    
    public EnumWrappers.ChatVisibility getChatFlags() {
        return this.handle.getChatVisibilities().read(0);
    }
    
    public void setChatFlags(final EnumWrappers.ChatVisibility value) {
        this.handle.getChatVisibilities().write(0, value);
    }
    
    public boolean getChatColours() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setChatColours(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public int getDisplayedSkinParts() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setDisplayedSkinParts(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.SETTINGS;
    }
}
