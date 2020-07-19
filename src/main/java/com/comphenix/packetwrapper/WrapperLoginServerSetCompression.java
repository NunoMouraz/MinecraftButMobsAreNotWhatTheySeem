// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperLoginServerSetCompression extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperLoginServerSetCompression() {
        super(new PacketContainer(WrapperLoginServerSetCompression.TYPE), WrapperLoginServerSetCompression.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperLoginServerSetCompression(final PacketContainer packet) {
        super(packet, WrapperLoginServerSetCompression.TYPE);
    }
    
    public int getThreshold() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setThreshold(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Login.Server.SET_COMPRESSION;
    }
}
