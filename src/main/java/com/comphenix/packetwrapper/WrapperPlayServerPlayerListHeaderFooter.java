// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerPlayerListHeaderFooter extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerPlayerListHeaderFooter() {
        super(new PacketContainer(WrapperPlayServerPlayerListHeaderFooter.TYPE), WrapperPlayServerPlayerListHeaderFooter.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerPlayerListHeaderFooter(final PacketContainer packet) {
        super(packet, WrapperPlayServerPlayerListHeaderFooter.TYPE);
    }
    
    public WrappedChatComponent getHeader() {
        return this.handle.getChatComponents().read(0);
    }
    
    public void setHeader(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    public WrappedChatComponent getFooter() {
        return this.handle.getChatComponents().read(1);
    }
    
    public void setFooter(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.PLAYER_LIST_HEADER_FOOTER;
    }
}
