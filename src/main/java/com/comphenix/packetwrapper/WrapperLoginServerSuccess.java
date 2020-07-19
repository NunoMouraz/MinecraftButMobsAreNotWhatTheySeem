// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedGameProfile;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperLoginServerSuccess extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperLoginServerSuccess() {
        super(new PacketContainer(WrapperLoginServerSuccess.TYPE), WrapperLoginServerSuccess.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperLoginServerSuccess(final PacketContainer packet) {
        super(packet, WrapperLoginServerSuccess.TYPE);
    }
    
    public WrappedGameProfile getProfile() {
        return this.handle.getGameProfiles().read(0);
    }
    
    public void setProfile(final WrappedGameProfile value) {
        this.handle.getGameProfiles().write(0, value);
    }
    
    static {
        TYPE = PacketType.Login.Server.SUCCESS;
    }
}
