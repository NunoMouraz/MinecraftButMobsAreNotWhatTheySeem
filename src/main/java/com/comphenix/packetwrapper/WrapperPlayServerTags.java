// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerTags extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerTags() {
        super(new PacketContainer(WrapperPlayServerTags.TYPE), WrapperPlayServerTags.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTags(final PacketContainer packet) {
        super(packet, WrapperPlayServerTags.TYPE);
    }
    
    static {
        TYPE = PacketType.Play.Server.TAGS;
    }
}
