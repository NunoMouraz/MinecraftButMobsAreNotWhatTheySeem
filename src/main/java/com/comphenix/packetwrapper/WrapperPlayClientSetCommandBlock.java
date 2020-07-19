// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientSetCommandBlock extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientSetCommandBlock() {
        super(new PacketContainer(WrapperPlayClientSetCommandBlock.TYPE), WrapperPlayClientSetCommandBlock.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSetCommandBlock(final PacketContainer packet) {
        super(packet, WrapperPlayClientSetCommandBlock.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().readSafely(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().writeSafely(0, value);
    }
    
    public String getCommand() {
        return this.handle.getStrings().read(0);
    }
    
    public void setCommand(final String value) {
        this.handle.getStrings().write(0, value);
    }
    
    public boolean isTrackOutput() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setTrackOutput(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public boolean isConditional() {
        return this.handle.getBooleans().read(1);
    }
    
    public void setConditional(final boolean value) {
        this.handle.getBooleans().write(1, value);
    }
    
    public boolean isAutomatic() {
        return this.handle.getBooleans().read(2);
    }
    
    public void setAutomatic(final boolean value) {
        this.handle.getBooleans().write(2, value);
    }
    
    public Mode getMode() {
        return (Mode)this.handle.getEnumModifier((Class)Mode.class, MinecraftReflection.getMinecraftClass("TileEntityCommand$Type")).readSafely(0);
    }
    
    public void setMode(final Mode mode) {
        this.handle.getEnumModifier((Class)Mode.class, MinecraftReflection.getMinecraftClass("TileEntityCommand$Type")).writeSafely(0, mode);
    }
    
    static {
        TYPE = PacketType.Play.Client.SET_COMMAND_BLOCK;
    }
    
    public enum Mode
    {
        SEQUENCE, 
        AUTO, 
        REDSTONE
    }
}
