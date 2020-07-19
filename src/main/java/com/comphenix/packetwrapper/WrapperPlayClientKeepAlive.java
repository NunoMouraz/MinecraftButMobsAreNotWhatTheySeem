// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientKeepAlive extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientKeepAlive() {
        super(new PacketContainer(WrapperPlayClientKeepAlive.TYPE), WrapperPlayClientKeepAlive.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientKeepAlive(final PacketContainer packet) {
        super(packet, WrapperPlayClientKeepAlive.TYPE);
    }
    
    public long getKeepAliveId() {
        return this.handle.getLongs().read(0);
    }
    
    public void setKeepAliveId(final long value) {
        this.handle.getLongs().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.KEEP_ALIVE;
    }
}
