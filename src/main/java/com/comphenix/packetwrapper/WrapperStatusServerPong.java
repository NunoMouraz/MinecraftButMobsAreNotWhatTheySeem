// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperStatusServerPong extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperStatusServerPong() {
        super(new PacketContainer(WrapperStatusServerPong.TYPE), WrapperStatusServerPong.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperStatusServerPong(final PacketContainer packet) {
        super(packet, WrapperStatusServerPong.TYPE);
    }
    
    public long getTime() {
        return this.handle.getLongs().read(0);
    }
    
    public void setTime(final long value) {
        this.handle.getLongs().write(0, value);
    }
    
    static {
        TYPE = PacketType.Status.Server.PONG;
    }
}
