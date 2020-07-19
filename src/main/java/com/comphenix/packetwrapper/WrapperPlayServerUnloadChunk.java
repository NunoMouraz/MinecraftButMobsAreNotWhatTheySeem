// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerUnloadChunk extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerUnloadChunk() {
        super(new PacketContainer(WrapperPlayServerUnloadChunk.TYPE), WrapperPlayServerUnloadChunk.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerUnloadChunk(final PacketContainer packet) {
        super(packet, WrapperPlayServerUnloadChunk.TYPE);
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
    
    static {
        TYPE = PacketType.Play.Server.UNLOAD_CHUNK;
    }
}
