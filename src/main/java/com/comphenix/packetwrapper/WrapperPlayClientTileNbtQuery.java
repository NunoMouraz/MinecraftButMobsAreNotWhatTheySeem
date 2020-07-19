// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientTileNbtQuery extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientTileNbtQuery() {
        super(new PacketContainer(WrapperPlayClientTileNbtQuery.TYPE), WrapperPlayClientTileNbtQuery.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientTileNbtQuery(final PacketContainer packet) {
        super(packet, WrapperPlayClientTileNbtQuery.TYPE);
    }
    
    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTransactionId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.TILE_NBT_QUERY;
    }
}
