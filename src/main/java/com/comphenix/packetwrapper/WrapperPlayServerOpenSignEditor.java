// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerOpenSignEditor extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerOpenSignEditor() {
        super(new PacketContainer(WrapperPlayServerOpenSignEditor.TYPE), WrapperPlayServerOpenSignEditor.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerOpenSignEditor(final PacketContainer packet) {
        super(packet, WrapperPlayServerOpenSignEditor.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.OPEN_SIGN_EDITOR;
    }
}
