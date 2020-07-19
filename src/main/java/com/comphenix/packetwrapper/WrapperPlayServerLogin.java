// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.WorldType;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.entity.Entity;
import org.bukkit.World;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerLogin extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerLogin() {
        super(new PacketContainer(WrapperPlayServerLogin.TYPE), WrapperPlayServerLogin.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerLogin(final PacketContainer packet) {
        super(packet, WrapperPlayServerLogin.TYPE);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(0);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public EnumWrappers.NativeGameMode getGamemode() {
        return this.handle.getGameModes().read(0);
    }
    
    public void setGamemode(final EnumWrappers.NativeGameMode value) {
        this.handle.getGameModes().write(0, value);
    }
    
    public int getDimension() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setDimension(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public EnumWrappers.Difficulty getDifficulty() {
        return this.handle.getDifficulties().read(0);
    }
    
    public void setDifficulty(final EnumWrappers.Difficulty value) {
        this.handle.getDifficulties().write(0, value);
    }
    
    public int getMaxPlayers() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setMaxPlayers(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public WorldType getLevelType() {
        return this.handle.getWorldTypeModifier().read(0);
    }
    
    public void setLevelType(final WorldType value) {
        this.handle.getWorldTypeModifier().write(0, value);
    }
    
    public boolean getReducedDebugInfo() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setReducedDebugInfo(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.LOGIN;
    }
}
