// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientAutoRecipe extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientAutoRecipe() {
        super(new PacketContainer(WrapperPlayClientAutoRecipe.TYPE), WrapperPlayClientAutoRecipe.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientAutoRecipe(final PacketContainer packet) {
        super(packet, WrapperPlayClientAutoRecipe.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public boolean isMakeAll() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setMakeAll(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.AUTO_RECIPE;
    }
}
