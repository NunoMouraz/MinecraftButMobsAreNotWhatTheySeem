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

public class WrapperPlayServerCustomPayload extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerCustomPayload() {
        super(new PacketContainer(WrapperPlayServerCustomPayload.TYPE), WrapperPlayServerCustomPayload.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCustomPayload(final PacketContainer packet) {
        super(packet, WrapperPlayServerCustomPayload.TYPE);
    }
    
    public MinecraftKey getChannel() {
        return this.handle.getMinecraftKeys().read(0);
    }
    
    public void setChannel(final MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
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
        TYPE = PacketType.Play.Server.CUSTOM_PAYLOAD;
    }
}
