// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.MultiBlockChangeInfo;
import com.comphenix.protocol.wrappers.ChunkCoordIntPair;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerMultiBlockChange extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerMultiBlockChange() {
        super(new PacketContainer(WrapperPlayServerMultiBlockChange.TYPE), WrapperPlayServerMultiBlockChange.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerMultiBlockChange(final PacketContainer packet) {
        super(packet, WrapperPlayServerMultiBlockChange.TYPE);
    }
    
    public ChunkCoordIntPair getChunk() {
        return this.handle.getChunkCoordIntPairs().read(0);
    }
    
    public void setChunk(final ChunkCoordIntPair value) {
        this.handle.getChunkCoordIntPairs().write(0, value);
    }
    
    public MultiBlockChangeInfo[] getRecords() {
        return this.handle.getMultiBlockChangeInfoArrays().read(0);
    }
    
    public void setRecords(final MultiBlockChangeInfo[] value) {
        this.handle.getMultiBlockChangeInfoArrays().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.MULTI_BLOCK_CHANGE;
    }
}
