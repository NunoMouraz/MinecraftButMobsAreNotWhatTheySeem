// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerKickDisconnect extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerKickDisconnect() {
        super(new PacketContainer(WrapperPlayServerKickDisconnect.TYPE), WrapperPlayServerKickDisconnect.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerKickDisconnect(final PacketContainer packet) {
        super(packet, WrapperPlayServerKickDisconnect.TYPE);
    }
    
    public WrappedChatComponent getReason() {
        return this.handle.getChatComponents().read(0);
    }
    
    public void setReason(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.KICK_DISCONNECT;
    }
}
