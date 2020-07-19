// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.boss.BarColor;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import java.util.UUID;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerBoss extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerBoss() {
        super(new PacketContainer(WrapperPlayServerBoss.TYPE), WrapperPlayServerBoss.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerBoss(final PacketContainer packet) {
        super(packet, WrapperPlayServerBoss.TYPE);
    }
    
    public UUID getUniqueId() {
        return this.handle.getUUIDs().read(0);
    }
    
    public void setUniqueId(final UUID value) {
        this.handle.getUUIDs().write(0, value);
    }
    
    public Action getAction() {
        return (Action)this.handle.getEnumModifier((Class)Action.class, 1).read(0);
    }
    
    public void setAction(final Action value) {
        this.handle.getEnumModifier((Class)Action.class, 1).write(0, value);
    }
    
    public WrappedChatComponent getTitle() {
        return this.handle.getChatComponents().read(0);
    }
    
    public void setTitle(final WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }
    
    public float getHealth() {
        return this.handle.getFloat().read(0);
    }
    
    public void setHealth(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public BarColor getColor() {
        return (BarColor)this.handle.getEnumModifier((Class)BarColor.class, 4).read(0);
    }
    
    public void setColor(final BarColor value) {
        this.handle.getEnumModifier((Class)BarColor.class, 4).write(0, value);
    }
    
    public BarStyle getStyle() {
        return (BarStyle)this.handle.getEnumModifier((Class)BarStyle.class, 5).read(0);
    }
    
    public void setStyle(final BarStyle value) {
        this.handle.getEnumModifier((Class)BarStyle.class, 5).write(0, value);
    }
    
    public boolean isDarkenSky() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setDarkenSky(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public boolean isPlayMusic() {
        return this.handle.getBooleans().read(1);
    }
    
    public void setPlayMusic(final boolean value) {
        this.handle.getBooleans().write(1, value);
    }
    
    public boolean isCreateFog() {
        return this.handle.getBooleans().read(2);
    }
    
    public void setCreateFog(final boolean value) {
        this.handle.getBooleans().write(2, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.BOSS;
    }
    
    public enum Action
    {
        ADD, 
        REMOVE, 
        UPDATE_PCT, 
        UPDATE_NAME, 
        UPDATE_STYLE, 
        UPDATE_PROPERTIES
    }
    
    public enum BarStyle
    {
        PROGRESS, 
        NOTCHED_6, 
        NOTCHED_10, 
        NOTCHED_12, 
        NOTCHED_20
    }
}
