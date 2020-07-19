// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerServerDifficulty extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerServerDifficulty() {
        super(new PacketContainer(WrapperPlayServerServerDifficulty.TYPE), WrapperPlayServerServerDifficulty.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerServerDifficulty(final PacketContainer packet) {
        super(packet, WrapperPlayServerServerDifficulty.TYPE);
    }
    
    public EnumWrappers.Difficulty getDifficulty() {
        return this.handle.getDifficulties().read(0);
    }
    
    public void setDifficulty(final EnumWrappers.Difficulty value) {
        this.handle.getDifficulties().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SERVER_DIFFICULTY;
    }
}
