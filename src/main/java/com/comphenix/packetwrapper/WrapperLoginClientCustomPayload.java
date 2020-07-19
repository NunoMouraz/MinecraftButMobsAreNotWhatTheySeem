// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperLoginClientCustomPayload extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperLoginClientCustomPayload() {
        super(new PacketContainer(WrapperLoginClientCustomPayload.TYPE), WrapperLoginClientCustomPayload.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperLoginClientCustomPayload(final PacketContainer packet) {
        super(packet, WrapperLoginClientCustomPayload.TYPE);
    }
    
    public int getMessageId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setMessageId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Login.Client.CUSTOM_PAYLOAD;
    }
}
