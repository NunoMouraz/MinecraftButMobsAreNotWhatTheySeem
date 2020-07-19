// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientTeleportAccept extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientTeleportAccept() {
        super(new PacketContainer(WrapperPlayClientTeleportAccept.TYPE), WrapperPlayClientTeleportAccept.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientTeleportAccept(final PacketContainer packet) {
        super(packet, WrapperPlayClientTeleportAccept.TYPE);
    }
    
    public int getTeleportId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTeleportId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.TELEPORT_ACCEPT;
    }
}
