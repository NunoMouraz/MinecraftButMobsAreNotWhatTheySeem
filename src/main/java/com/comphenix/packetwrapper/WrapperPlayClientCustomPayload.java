// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import io.netty.buffer.Unpooled;
import com.comphenix.protocol.utility.MinecraftReflection;
import io.netty.buffer.ByteBuf;
import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientCustomPayload extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientCustomPayload() {
        super(new PacketContainer(WrapperPlayClientCustomPayload.TYPE), WrapperPlayClientCustomPayload.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientCustomPayload(final PacketContainer packet) {
        super(packet, WrapperPlayClientCustomPayload.TYPE);
    }
    
    public MinecraftKey getChannel() {
        return this.handle.getMinecraftKeys().readSafely(0);
    }
    
    public void setChannel(final MinecraftKey value) {
        this.handle.getMinecraftKeys().writeSafely(0, value);
    }
    
    public ByteBuf getContentsBuffer() {
        return (ByteBuf)this.handle.getModifier().withType(ByteBuf.class).read(0);
    }
    
    public byte[] getContents() {
        final ByteBuf buffer = this.getContentsBuffer();
        final byte[] array = new byte[buffer.readableBytes()];
        buffer.readBytes(array);
        return array;
    }
    
    public void setContentsBuffer(final ByteBuf contents) {
        if (MinecraftReflection.is(MinecraftReflection.getPacketDataSerializerClass(), contents)) {
            this.handle.getModifier().withType(ByteBuf.class).write(0, contents);
        }
        else {
            final Object serializer = MinecraftReflection.getPacketDataSerializer(contents);
            this.handle.getModifier().withType(ByteBuf.class).write(0, serializer);
        }
    }
    
    public void setContents(final byte[] content) {
        this.setContentsBuffer(Unpooled.copiedBuffer(content));
    }
    
    static {
        TYPE = PacketType.Play.Client.CUSTOM_PAYLOAD;
    }
}
