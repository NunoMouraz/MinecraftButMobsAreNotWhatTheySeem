// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.reflect.IntEnum;
import java.util.Collection;
import java.util.List;
import com.comphenix.protocol.utility.MinecraftReflection;
import org.bukkit.ChatColor;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerScoreboardTeam extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerScoreboardTeam() {
        super(new PacketContainer(WrapperPlayServerScoreboardTeam.TYPE), WrapperPlayServerScoreboardTeam.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerScoreboardTeam(final PacketContainer packet) {
        super(packet, WrapperPlayServerScoreboardTeam.TYPE);
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
    
    public WrappedChatComponent getPrefix() {
        return this.handle.getChatComponents().read(1);
    }
    
    public void setPrefix(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(1, value);
    }
    
    public WrappedChatComponent getSuffix() {
        return this.handle.getChatComponents().read(2);
    }
    
    public void setSuffix(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(2, value);
    }
    
    public String getNameTagVisibility() {
        return this.handle.getStrings().read(1);
    }
    
    public void setNameTagVisibility(final String value) {
        this.handle.getStrings().write(1, value);
    }
    
    public ChatColor getColor() {
        return (ChatColor)this.handle.getEnumModifier((Class)ChatColor.class, MinecraftReflection.getMinecraftClass("EnumChatFormat")).read(0);
    }
    
    public void setColor(final ChatColor value) {
        this.handle.getEnumModifier((Class)ChatColor.class, MinecraftReflection.getMinecraftClass("EnumChatFormat")).write(0, value);
    }
    
    public String getCollisionRule() {
        return this.handle.getStrings().read(2);
    }
    
    public void setCollisionRule(final String value) {
        this.handle.getStrings().write(2, value);
    }
    
    public List<String> getPlayers() {
        return (List<String>)this.handle.getSpecificModifier((Class)Collection.class).read(0);
    }
    
    public void setPlayers(final List<String> value) {
        this.handle.getSpecificModifier((Class)Collection.class).write(0, value);
    }
    
    public int getMode() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setMode(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getPackOptionData() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setPackOptionData(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SCOREBOARD_TEAM;
    }
    
    public static class Mode extends IntEnum
    {
        public static final int TEAM_CREATED = 0;
        public static final int TEAM_REMOVED = 1;
        public static final int TEAM_UPDATED = 2;
        public static final int PLAYERS_ADDED = 3;
        public static final int PLAYERS_REMOVED = 4;
        private static final Mode INSTANCE;
        
        public static Mode getInstance() {
            return Mode.INSTANCE;
        }
        
        static {
            INSTANCE = new Mode();
        }
    }
}
