// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientTabComplete extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientTabComplete() {
        super(new PacketContainer(WrapperPlayClientTabComplete.TYPE), WrapperPlayClientTabComplete.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientTabComplete(final PacketContainer packet) {
        super(packet, WrapperPlayClientTabComplete.TYPE);
    }
    
    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTransactionId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public String getInput() {
        return this.handle.getStrings().read(0);
    }
    
    public void setInput(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.TAB_COMPLETE;
    }
}
