// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperLoginClientEncryptionBegin extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperLoginClientEncryptionBegin() {
        super(new PacketContainer(WrapperLoginClientEncryptionBegin.TYPE), WrapperLoginClientEncryptionBegin.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperLoginClientEncryptionBegin(final PacketContainer packet) {
        super(packet, WrapperLoginClientEncryptionBegin.TYPE);
    }
    
    public byte[] getSharedSecret() {
        return this.handle.getByteArrays().read(0);
    }
    
    public void setSharedSecret(final byte[] value) {
        this.handle.getByteArrays().write(0, value);
    }
    
    public byte[] getVerifyToken() {
        return this.handle.getByteArrays().read(1);
    }
    
    public void setVerifyToken(final byte[] value) {
        this.handle.getByteArrays().write(1, value);
    }
    
    static {
        TYPE = PacketType.Login.Client.ENCRYPTION_BEGIN;
    }
}
