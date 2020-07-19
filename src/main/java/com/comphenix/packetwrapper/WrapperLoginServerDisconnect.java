// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperLoginServerDisconnect extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperLoginServerDisconnect() {
        super(new PacketContainer(WrapperLoginServerDisconnect.TYPE), WrapperLoginServerDisconnect.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperLoginServerDisconnect(final PacketContainer packet) {
        super(packet, WrapperLoginServerDisconnect.TYPE);
    }
    
    public WrappedChatComponent getReason() {
        return this.handle.getChatComponents().read(0);
    }
    
    @Deprecated
    public WrappedChatComponent getJsonData() {
        return this.getReason();
    }
    
    public void setReason(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    @Deprecated
    public void setJsonData(final WrappedChatComponent value) {
        this.setReason(value);
    }
    
    static {
        TYPE = PacketType.Login.Server.DISCONNECT;
    }
}
