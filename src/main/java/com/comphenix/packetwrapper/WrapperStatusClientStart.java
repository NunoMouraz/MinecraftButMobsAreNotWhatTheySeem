// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperStatusClientStart extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperStatusClientStart() {
        super(new PacketContainer(WrapperStatusClientStart.TYPE), WrapperStatusClientStart.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperStatusClientStart(final PacketContainer packet) {
        super(packet, WrapperStatusClientStart.TYPE);
    }
    
    static {
        TYPE = PacketType.Status.Client.START;
    }
}
