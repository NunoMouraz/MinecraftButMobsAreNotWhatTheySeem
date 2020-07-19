// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerTitle extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerTitle() {
        super(new PacketContainer(WrapperPlayServerTitle.TYPE), WrapperPlayServerTitle.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTitle(final PacketContainer packet) {
        super(packet, WrapperPlayServerTitle.TYPE);
    }
    
    public EnumWrappers.TitleAction getAction() {
        return this.handle.getTitleActions().read(0);
    }
    
    public void setAction(final EnumWrappers.TitleAction value) {
        this.handle.getTitleActions().write(0, value);
    }
    
    public WrappedChatComponent getTitle() {
        return this.handle.getChatComponents().read(0);
    }
    
    public void setTitle(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    public int getFadeIn() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setFadeIn(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getStay() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setStay(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public int getFadeOut() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setFadeOut(final int value) {
        this.handle.getIntegers().write(2, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.TITLE;
    }
}
