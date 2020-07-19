// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperHandshakingClientSetProtocol extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperHandshakingClientSetProtocol() {
        super(new PacketContainer(WrapperHandshakingClientSetProtocol.TYPE), WrapperHandshakingClientSetProtocol.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperHandshakingClientSetProtocol(final PacketContainer packet) {
        super(packet, WrapperHandshakingClientSetProtocol.TYPE);
    }
    
    public int getProtocolVersion() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setProtocolVersion(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public String getServerAddressHostnameOrIp() {
        return this.handle.getStrings().read(0);
    }
    
    public void setServerAddressHostnameOrIp(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public int getServerPort() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setServerPort(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public PacketType.Protocol getNextState() {
        return this.handle.getProtocols().read(0);
    }
    
    public void setNextState(final PacketType.Protocol value) {
        this.handle.getProtocols().write(0, value);
    }
    
    static {
        TYPE = PacketType.Handshake.Client.SET_PROTOCOL;
    }
}
