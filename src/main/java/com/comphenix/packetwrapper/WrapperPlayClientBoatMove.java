// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientBoatMove extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientBoatMove() {
        super(new PacketContainer(WrapperPlayClientBoatMove.TYPE), WrapperPlayClientBoatMove.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBoatMove(final PacketContainer packet) {
        super(packet, WrapperPlayClientBoatMove.TYPE);
    }
    
    public boolean getLeftOar() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setLeftOar(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public boolean getRightOar() {
        return this.handle.getBooleans().read(1);
    }
    
    public void setRightOar(final boolean value) {
        this.handle.getBooleans().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.BOAT_MOVE;
    }
}
