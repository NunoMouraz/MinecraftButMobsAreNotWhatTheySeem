// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerCamera extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerCamera() {
        super(new PacketContainer(WrapperPlayServerCamera.TYPE), WrapperPlayServerCamera.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCamera(final PacketContainer packet) {
        super(packet, WrapperPlayServerCamera.TYPE);
    }
    
    public int getCameraId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setCameraId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.CAMERA;
    }
}
