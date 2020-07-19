// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import java.util.Arrays;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerChat extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerChat() {
        super(new PacketContainer(WrapperPlayServerChat.TYPE), WrapperPlayServerChat.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerChat(final PacketContainer packet) {
        super(packet, WrapperPlayServerChat.TYPE);
    }
    
    public WrappedChatComponent getMessage() {
        return this.handle.getChatComponents().read(0);
    }
    
    public void setMessage(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    public EnumWrappers.ChatType getChatType() {
        return this.handle.getChatTypes().read(0);
    }
    
    public void setChatType(final EnumWrappers.ChatType type) {
        this.handle.getChatTypes().write(0, type);
    }
    
    @Deprecated
    public byte getPosition() {
        final Byte position = this.handle.getBytes().readSafely(0);
        if (position != null) {
            return position;
        }
        return this.getChatType().getId();
    }
    
    @Deprecated
    public void setPosition(final byte value) {
        this.handle.getBytes().writeSafely(0, value);
        if (EnumWrappers.getChatTypeClass() != null) {
            Arrays.stream(EnumWrappers.ChatType.values()).filter(t -> t.getId() == value).findAny().ifPresent(t -> this.handle.getChatTypes().writeSafely(0, t));
        }
    }
    
    static {
        TYPE = PacketType.Play.Server.CHAT;
    }
}
