// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.WorldType;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerRespawn extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerRespawn() {
        super(new PacketContainer(WrapperPlayServerRespawn.TYPE), WrapperPlayServerRespawn.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRespawn(final PacketContainer packet) {
        super(packet, WrapperPlayServerRespawn.TYPE);
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
    
    public EnumWrappers.NativeGameMode getGamemode() {
        return this.handle.getGameModes().read(0);
    }
    
    public void setGamemode(final EnumWrappers.NativeGameMode value) {
        this.handle.getGameModes().write(0, value);
    }
    
    public WorldType getLevelType() {
        return this.handle.getWorldTypeModifier().read(0);
    }
    
    public void setLevelType(final WorldType value) {
        this.handle.getWorldTypeModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.RESPAWN;
    }
}
