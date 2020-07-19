// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedServerPing;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperStatusServerServerInfo extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperStatusServerServerInfo() {
        super(new PacketContainer(WrapperStatusServerServerInfo.TYPE), WrapperStatusServerServerInfo.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperStatusServerServerInfo(final PacketContainer packet) {
        super(packet, WrapperStatusServerServerInfo.TYPE);
    }
    
    public WrappedServerPing getJsonResponse() {
        return this.handle.getServerPings().read(0);
    }
    
    public void setJsonResponse(final WrappedServerPing value) {
        this.handle.getServerPings().write(0, value);
    }
    
    static {
        TYPE = PacketType.Status.Server.SERVER_INFO;
    }
}
