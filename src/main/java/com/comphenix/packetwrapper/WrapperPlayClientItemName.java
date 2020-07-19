// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientItemName extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientItemName() {
        super(new PacketContainer(WrapperPlayClientItemName.TYPE), WrapperPlayClientItemName.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientItemName(final PacketContainer packet) {
        super(packet, WrapperPlayClientItemName.TYPE);
    }
    
    public String getItemName() {
        return this.handle.getStrings().read(0);
    }
    
    public void setItemName(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.ITEM_NAME;
    }
}
