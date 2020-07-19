// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.Location;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.World;

public class ChunkPacketProcessor
{
    protected static final int BYTES_PER_NIBBLE_PART = 2048;
    protected static final int CHUNK_SEGMENTS = 16;
    protected static final int NIBBLES_REQUIRED = 4;
    @Deprecated
    public static final int BLOCK_ID_LENGHT = 4096;
    public static final int BLOCK_ID_LENGTH = 4096;
    @Deprecated
    public static final int DATA_LENGHT = 2048;
    public static final int DATA_LENGTH = 2048;
    public static final int BIOME_ARRAY_LENGTH = 256;
    private int chunkX;
    private int chunkZ;
    private int chunkMask;
    private int extraMask;
    private int chunkSectionNumber;
    private int extraSectionNumber;
    private boolean hasContinuous;
    private int startIndex;
    private int size;
    private byte[] data;
    private World world;
    
    private ChunkPacketProcessor() {
        this.hasContinuous = true;
    }
    
    public static ChunkPacketProcessor fromMapPacket(final PacketContainer packet, final World world) {
        if (!packet.getType().equals((Object)PacketType.Play.Server.MAP_CHUNK)) {
            throw new IllegalArgumentException(packet + " must be a MAP_CHUNK packet.");
        }
        final StructureModifier<Integer> ints = (StructureModifier<Integer>)packet.getIntegers();
        final StructureModifier<byte[]> byteArray = (StructureModifier<byte[]>)packet.getByteArrays();
        final ChunkPacketProcessor processor = new ChunkPacketProcessor();
        processor.world = world;
        processor.chunkX = (int)ints.read(0);
        processor.chunkZ = (int)ints.read(1);
        processor.chunkMask = (int)ints.read(2);
        processor.extraMask = (int)ints.read(3);
        processor.data = (byte[])byteArray.read(1);
        processor.startIndex = 0;
        if (packet.getBooleans().size() > 0) {
            processor.hasContinuous = (boolean)packet.getBooleans().read(0);
        }
        return processor;
    }
    
    public void process(final ChunkletProcessor processor) {
        for (int i = 0; i < 16; ++i) {
            if ((this.chunkMask & 1 << i) > 0) {
                ++this.chunkSectionNumber;
            }
            if ((this.extraMask & 1 << i) > 0) {
                ++this.extraSectionNumber;
            }
        }
        final int skylightCount = this.getSkylightCount();
        this.size = 2048 * ((4 + skylightCount) * this.chunkSectionNumber + this.extraSectionNumber) + (this.hasContinuous ? 256 : 0);
        if (this.getOffset(2) - this.startIndex > this.data.length) {
            return;
        }
        if (this.isChunkLoaded(this.world, this.chunkX, this.chunkZ)) {
            this.translate(processor);
        }
    }
    
    protected int getSkylightCount() {
        return (this.world.getEnvironment() == World.Environment.NORMAL) ? 1 : 0;
    }
    
    private int getOffset(final int nibbles) {
        return this.startIndex + nibbles * this.chunkSectionNumber * 2048;
    }
    
    private void translate(final ChunkletProcessor processor) {
        int current = 4;
        final ChunkOffsets offsets = new ChunkOffsets(this.getOffset(0), this.getOffset(2), this.getOffset(3), (this.getSkylightCount() > 0) ? this.getOffset(current++) : -1, (this.extraSectionNumber > 0) ? this.getOffset(current++) : -1);
        for (int i = 0; i < 16; ++i) {
            if ((this.chunkMask & 1 << i) > 0) {
                final Location origin = new Location(this.world, (double)(this.chunkX << 4), (double)(i * 16), (double)(this.chunkZ << 4));
                processor.processChunklet(origin, this.data, offsets);
                offsets.incrementIdIndex();
            }
            if ((this.extraMask & 1 << i) > 0) {
                offsets.incrementExtraIndex();
            }
        }
        if (this.hasContinuous) {
            processor.processBiomeArray(new Location(this.world, (double)(this.chunkX << 4), 0.0, (double)(this.chunkZ << 4)), this.data, this.startIndex + this.size - 256);
        }
    }
    
    private boolean isChunkLoaded(final World world, final int x, final int z) {
        return world.isChunkLoaded(x, z);
    }
    
    public static class ChunkOffsets
    {
        private int blockIdOffset;
        private int dataOffset;
        private int lightOffset;
        private int skylightOffset;
        private int extraOffset;
        
        private ChunkOffsets(final int blockIdOffset, final int dataOffset, final int lightOffset, final int skylightOffset, final int extraOffset) {
            this.blockIdOffset = blockIdOffset;
            this.dataOffset = dataOffset;
            this.lightOffset = lightOffset;
            this.skylightOffset = skylightOffset;
            this.extraOffset = extraOffset;
        }
        
        private void incrementIdIndex() {
            this.blockIdOffset += 4096;
            this.dataOffset += 2048;
            this.dataOffset += 2048;
            if (this.skylightOffset >= 0) {
                this.skylightOffset += 2048;
            }
        }
        
        private void incrementExtraIndex() {
            if (this.extraOffset >= 0) {
                this.extraOffset += 2048;
            }
        }
        
        public int getBlockIdOffset() {
            return this.blockIdOffset;
        }
        
        public int getDataOffset() {
            return this.dataOffset;
        }
        
        public int getLightOffset() {
            return this.lightOffset;
        }
        
        public int getSkylightOffset() {
            return this.skylightOffset;
        }
        
        public boolean hasSkylightOffset() {
            return this.skylightOffset >= 0;
        }
        
        public int getExtraOffset() {
            return this.extraOffset;
        }
        
        public boolean hasExtraOffset() {
            return this.extraOffset > 0;
        }
    }
    
    public interface ChunkletProcessor
    {
        void processChunklet(final Location p0, final byte[] p1, final ChunkOffsets p2);
        
        void processBiomeArray(final Location p0, final byte[] p1, final int p2);
    }
}
