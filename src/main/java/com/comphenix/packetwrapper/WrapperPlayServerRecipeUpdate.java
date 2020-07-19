// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerRecipeUpdate extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerRecipeUpdate() {
        super(new PacketContainer(WrapperPlayServerRecipeUpdate.TYPE), WrapperPlayServerRecipeUpdate.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRecipeUpdate(final PacketContainer packet) {
        super(packet, WrapperPlayServerRecipeUpdate.TYPE);
    }
    
    static {
        TYPE = PacketType.Play.Server.RECIPE_UPDATE;
    }
}
