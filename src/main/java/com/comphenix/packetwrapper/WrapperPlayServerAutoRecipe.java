// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerAutoRecipe extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerAutoRecipe() {
        super(new PacketContainer(WrapperPlayServerAutoRecipe.TYPE), WrapperPlayServerAutoRecipe.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAutoRecipe(final PacketContainer packet) {
        super(packet, WrapperPlayServerAutoRecipe.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.AUTO_RECIPE;
    }
}
