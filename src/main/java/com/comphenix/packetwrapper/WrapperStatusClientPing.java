// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperStatusClientPing extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperStatusClientPing() {
        super(new PacketContainer(WrapperStatusClientPing.TYPE), WrapperStatusClientPing.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperStatusClientPing(final PacketContainer packet) {
        super(packet, WrapperStatusClientPing.TYPE);
    }
    
    public long getTime() {
        return this.handle.getLongs().read(0);
    }
    
    public void setTime(final long value) {
        this.handle.getLongs().write(0, value);
    }
    
    static {
        TYPE = PacketType.Status.Client.PING;
    }
}
