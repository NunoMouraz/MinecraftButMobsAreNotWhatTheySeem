// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientClientCommand extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientClientCommand() {
        super(new PacketContainer(WrapperPlayClientClientCommand.TYPE), WrapperPlayClientClientCommand.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientClientCommand(final PacketContainer packet) {
        super(packet, WrapperPlayClientClientCommand.TYPE);
    }
    
    public EnumWrappers.ClientCommand getAction() {
        return this.handle.getClientCommands().read(0);
    }
    
    public void setAction(final EnumWrappers.ClientCommand value) {
        this.handle.getClientCommands().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.CLIENT_COMMAND;
    }
}
