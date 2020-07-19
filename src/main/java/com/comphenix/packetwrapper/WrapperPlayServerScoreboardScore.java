// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerScoreboardScore extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerScoreboardScore() {
        super(new PacketContainer(WrapperPlayServerScoreboardScore.TYPE), WrapperPlayServerScoreboardScore.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerScoreboardScore(final PacketContainer packet) {
        super(packet, WrapperPlayServerScoreboardScore.TYPE);
    }
    
    public String getScoreName() {
        return this.handle.getStrings().read(0);
    }
    
    public void setScoreName(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public String getObjectiveName() {
        return this.handle.getStrings().read(1);
    }
    
    public void setObjectiveName(final String value) {
        this.handle.getStrings().write(1, value);
    }
    
    public int getValue() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setValue(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public EnumWrappers.ScoreboardAction getAction() {
        return this.handle.getScoreboardActions().read(0);
    }
    
    public void setScoreboardAction(final EnumWrappers.ScoreboardAction value) {
        this.handle.getScoreboardActions().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SCOREBOARD_SCORE;
    }
}
