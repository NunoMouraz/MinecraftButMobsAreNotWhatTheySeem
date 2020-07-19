// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerScoreboardDisplayObjective extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerScoreboardDisplayObjective() {
        super(new PacketContainer(WrapperPlayServerScoreboardDisplayObjective.TYPE), WrapperPlayServerScoreboardDisplayObjective.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerScoreboardDisplayObjective(final PacketContainer packet) {
        super(packet, WrapperPlayServerScoreboardDisplayObjective.TYPE);
    }
    
    public int getPosition() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setPosition(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public String getScoreName() {
        return this.handle.getStrings().read(0);
    }
    
    public void setScoreName(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SCOREBOARD_DISPLAY_OBJECTIVE;
    }
}
