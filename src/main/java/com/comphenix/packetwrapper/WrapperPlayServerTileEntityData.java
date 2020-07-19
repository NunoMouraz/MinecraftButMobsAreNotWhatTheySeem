// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.nbt.NbtBase;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerTileEntityData extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerTileEntityData() {
        super(new PacketContainer(WrapperPlayServerTileEntityData.TYPE), WrapperPlayServerTileEntityData.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTileEntityData(final PacketContainer packet) {
        super(packet, WrapperPlayServerTileEntityData.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public int getAction() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setAction(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public NbtBase<?> getNbtData() {
        return this.handle.getNbtModifier().read(0);
    }
    
    public void setNbtData(final NbtBase<?> value) {
        this.handle.getNbtModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.TILE_ENTITY_DATA;
    }
}
