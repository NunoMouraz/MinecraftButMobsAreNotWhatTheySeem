// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperLoginServerCustomPayload extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperLoginServerCustomPayload() {
        super(new PacketContainer(WrapperLoginServerCustomPayload.TYPE), WrapperLoginServerCustomPayload.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperLoginServerCustomPayload(final PacketContainer packet) {
        super(packet, WrapperLoginServerCustomPayload.TYPE);
    }
    
    public int getMessageId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setMessageId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Login.Server.CUSTOM_PAYLOAD;
    }
}
