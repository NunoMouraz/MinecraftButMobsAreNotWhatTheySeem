// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerKeepAlive extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerKeepAlive() {
        super(new PacketContainer(WrapperPlayServerKeepAlive.TYPE), WrapperPlayServerKeepAlive.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerKeepAlive(final PacketContainer packet) {
        super(packet, WrapperPlayServerKeepAlive.TYPE);
    }
    
    public long getKeepAliveId() {
        return this.handle.getLongs().read(0);
    }
    
    public void setKeepAliveId(final long value) {
        this.handle.getLongs().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.KEEP_ALIVE;
    }
}
