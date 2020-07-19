// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientFlying extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientFlying() {
        super(new PacketContainer(WrapperPlayClientFlying.TYPE), WrapperPlayClientFlying.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientFlying(final PacketContainer packet) {
        super(packet, WrapperPlayClientFlying.TYPE);
    }
    
    public boolean getOnGround() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setOnGround(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.FLYING;
    }
}
