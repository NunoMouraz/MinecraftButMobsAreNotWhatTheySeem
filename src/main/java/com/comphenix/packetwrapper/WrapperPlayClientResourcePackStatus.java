// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientResourcePackStatus extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientResourcePackStatus() {
        super(new PacketContainer(WrapperPlayClientResourcePackStatus.TYPE), WrapperPlayClientResourcePackStatus.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientResourcePackStatus(final PacketContainer packet) {
        super(packet, WrapperPlayClientResourcePackStatus.TYPE);
    }
    
    public EnumWrappers.ResourcePackStatus getResult() {
        return this.handle.getResourcePackStatus().read(0);
    }
    
    public void setResult(final EnumWrappers.ResourcePackStatus value) {
        this.handle.getResourcePackStatus().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.RESOURCE_PACK_STATUS;
    }
}
