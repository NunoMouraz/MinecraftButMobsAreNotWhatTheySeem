// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerStatistic extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerStatistic() {
        super(new PacketContainer(WrapperPlayServerStatistic.TYPE), WrapperPlayServerStatistic.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerStatistic(final PacketContainer packet) {
        super(packet, WrapperPlayServerStatistic.TYPE);
    }
    
    static {
        TYPE = PacketType.Play.Server.STATISTIC;
    }
}
