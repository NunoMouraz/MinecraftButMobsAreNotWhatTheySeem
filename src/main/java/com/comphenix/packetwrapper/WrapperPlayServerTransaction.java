// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerTransaction extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerTransaction() {
        super(new PacketContainer(WrapperPlayServerTransaction.TYPE), WrapperPlayServerTransaction.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTransaction(final PacketContainer packet) {
        super(packet, WrapperPlayServerTransaction.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final int value) {
        this.handle.getIntegers().write(0, value);
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
        TYPE = PacketType.Play.Server.TRANSACTION;
    }
}
