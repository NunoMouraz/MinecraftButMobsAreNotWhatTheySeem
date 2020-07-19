// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import java.util.UUID;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientSpectate extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientSpectate() {
        super(new PacketContainer(WrapperPlayClientSpectate.TYPE), WrapperPlayClientSpectate.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSpectate(final PacketContainer packet) {
        super(packet, WrapperPlayClientSpectate.TYPE);
    }
    
    public UUID getTargetPlayer() {
        return this.handle.getUUIDs().read(0);
    }
    
    public void setTargetPlayer(final UUID value) {
        this.handle.getUUIDs().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.SPECTATE;
    }
}
