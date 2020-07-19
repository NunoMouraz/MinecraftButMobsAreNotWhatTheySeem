// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.mojang.brigadier.tree.RootCommandNode;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerCommands extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerCommands() {
        super(new PacketContainer(WrapperPlayServerCommands.TYPE), WrapperPlayServerCommands.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCommands(final PacketContainer packet) {
        super(packet, WrapperPlayServerCommands.TYPE);
    }
    
    public RootCommandNode getRoot() {
        return (RootCommandNode)this.handle.getModifier().read(0);
    }
    
    public void setRoot(final RootCommandNode node) {
        this.handle.getModifier().write(0, node);
    }
    
    static {
        TYPE = PacketType.Play.Server.COMMANDS;
    }
}
