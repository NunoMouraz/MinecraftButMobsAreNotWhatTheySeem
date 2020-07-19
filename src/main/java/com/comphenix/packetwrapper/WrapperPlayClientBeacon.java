// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientBeacon extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientBeacon() {
        super(new PacketContainer(WrapperPlayClientBeacon.TYPE), WrapperPlayClientBeacon.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBeacon(final PacketContainer packet) {
        super(packet, WrapperPlayClientBeacon.TYPE);
    }
    
    public int getPrimaryEffect() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setPrimaryEffect(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getSecondaryEffect() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setSecondaryEffect(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.BEACON;
    }
}
