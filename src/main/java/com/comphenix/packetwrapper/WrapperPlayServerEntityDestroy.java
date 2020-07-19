// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerEntityDestroy extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerEntityDestroy() {
        super(new PacketContainer(WrapperPlayServerEntityDestroy.TYPE), WrapperPlayServerEntityDestroy.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntityDestroy(final PacketContainer packet) {
        super(packet, WrapperPlayServerEntityDestroy.TYPE);
    }
    
    public int getCount() {
        return this.handle.getIntegerArrays().read(0).length;
    }
    
    public int[] getEntityIDs() {
        return this.handle.getIntegerArrays().read(0);
    }
    
    public void setEntityIds(final int[] value) {
        this.handle.getIntegerArrays().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.ENTITY_DESTROY;
    }
}
