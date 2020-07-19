// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.reflect.IntEnum;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerScoreboardObjective extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerScoreboardObjective() {
        super(new PacketContainer(WrapperPlayServerScoreboardObjective.TYPE), WrapperPlayServerScoreboardObjective.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerScoreboardObjective(final PacketContainer packet) {
        super(packet, WrapperPlayServerScoreboardObjective.TYPE);
    }
    
    public String getName() {
        return this.handle.getStrings().read(0);
    }
    
    public void setName(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public WrappedChatComponent getDisplayName() {
        return this.handle.getChatComponents().read(0);
    }
    
    public void setDisplayName(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    public HealthDisplay getHealthDisplay() {
        return (HealthDisplay)this.handle.getEnumModifier((Class)HealthDisplay.class, 2).read(0);
    }
    
    public void setHealthDisplay(final HealthDisplay value) {
        this.handle.getEnumModifier((Class)HealthDisplay.class, 2).write(0, value);
    }
    
    public int getMode() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setMode(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SCOREBOARD_OBJECTIVE;
    }
    
    public static class Mode extends IntEnum
    {
        public static final int ADD_OBJECTIVE = 0;
        public static final int REMOVE_OBJECTIVE = 1;
        public static final int UPDATE_VALUE = 2;
        private static final Mode INSTANCE;
        
        public static Mode getInstance() {
            return Mode.INSTANCE;
        }
        
        static {
            INSTANCE = new Mode();
        }
    }
    
    public enum HealthDisplay
    {
        INTEGER, 
        HEARTS
    }
}
