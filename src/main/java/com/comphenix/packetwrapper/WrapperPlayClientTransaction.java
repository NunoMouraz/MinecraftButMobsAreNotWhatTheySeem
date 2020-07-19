// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientTransaction extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientTransaction() {
        super(new PacketContainer(WrapperPlayClientTransaction.TYPE), WrapperPlayClientTransaction.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientTransaction(final PacketContainer packet) {
        super(packet, WrapperPlayClientTransaction.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final byte value) {
        this.handle.getIntegers().write(0, (int)value);
    }
    
    public short getActionNumber() {
        return this.handle.getShorts().read(0);
    }
    
    public void setActionNumber(final short value) {
        this.handle.getShorts().write(0, value);
    }
    
    public boolean getAccepted() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setAccepted(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.TRANSACTION;
    }
}
