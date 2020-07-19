// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.nbt.NbtBase;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerNbtQuery extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerNbtQuery() {
        super(new PacketContainer(WrapperPlayServerNbtQuery.TYPE), WrapperPlayServerNbtQuery.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerNbtQuery(final PacketContainer packet) {
        super(packet, WrapperPlayServerNbtQuery.TYPE);
    }
    
    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTransactionId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public NbtBase<?> getNbt() {
        return this.handle.getNbtModifier().read(0);
    }
    
    public void setNbt(final NbtBase<?> value) {
        this.handle.getNbtModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.NBT_QUERY;
    }
}
