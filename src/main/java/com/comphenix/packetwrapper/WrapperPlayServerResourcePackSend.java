// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerResourcePackSend extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerResourcePackSend() {
        super(new PacketContainer(WrapperPlayServerResourcePackSend.TYPE), WrapperPlayServerResourcePackSend.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerResourcePackSend(final PacketContainer packet) {
        super(packet, WrapperPlayServerResourcePackSend.TYPE);
    }
    
    public String getUrl() {
        return this.handle.getStrings().read(0);
    }
    
    public void setUrl(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public String getHash() {
        return this.handle.getStrings().read(1);
    }
    
    public void setHash(final String value) {
        this.handle.getStrings().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.RESOURCE_PACK_SEND;
    }
}
