// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedGameProfile;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperLoginClientStart extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperLoginClientStart() {
        super(new PacketContainer(WrapperLoginClientStart.TYPE), WrapperLoginClientStart.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperLoginClientStart(final PacketContainer packet) {
        super(packet, WrapperLoginClientStart.TYPE);
    }
    
    public WrappedGameProfile getProfile() {
        return this.handle.getGameProfiles().read(0);
    }
    
    public void setProfile(final WrappedGameProfile value) {
        this.handle.getGameProfiles().write(0, value);
    }
    
    static {
        TYPE = PacketType.Login.Client.START;
    }
}
