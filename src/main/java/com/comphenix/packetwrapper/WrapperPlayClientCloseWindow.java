// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientCloseWindow extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientCloseWindow() {
        super(new PacketContainer(WrapperPlayClientCloseWindow.TYPE), WrapperPlayClientCloseWindow.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientCloseWindow(final PacketContainer packet) {
        super(packet, WrapperPlayClientCloseWindow.TYPE);
    }
    
    public int getWindowId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setWindowId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.CLOSE_WINDOW;
    }
}
