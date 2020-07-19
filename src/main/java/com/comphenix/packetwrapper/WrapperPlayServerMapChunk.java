// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.nbt.NbtBase;
import java.util.List;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerMapChunk extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerMapChunk() {
        super(new PacketContainer(WrapperPlayServerMapChunk.TYPE), WrapperPlayServerMapChunk.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerMapChunk(final PacketContainer packet) {
        super(packet, WrapperPlayServerMapChunk.TYPE);
    }
    
    public int getChunkX() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setChunkX(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getChunkZ() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setChunkZ(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public boolean getGroundUpContinuous() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setGroundUpContinuous(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public int getBitmask() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setBitmask(final int value) {
        this.handle.getIntegers().write(2, value);
    }
    
    public byte[] getData() {
        return this.handle.getByteArrays().read(0);
    }
    
    public void setData(final byte[] value) {
        this.handle.getByteArrays().write(0, value);
    }
    
    public List<NbtBase<?>> getTileEntities() {
        return this.handle.getListNbtModifier().read(0);
    }
    
    public void setTileEntities(final List<NbtBase<?>> value) {
        this.handle.getListNbtModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.MAP_CHUNK;
    }
}
