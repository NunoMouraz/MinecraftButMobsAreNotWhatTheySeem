// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.EnumWrappers;
import java.util.Set;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerPosition extends AbstractPacket
{
    public static final PacketType TYPE;
    private static final Class<?> FLAGS_CLASS;
    
    public WrapperPlayServerPosition() {
        super(new PacketContainer(WrapperPlayServerPosition.TYPE), WrapperPlayServerPosition.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerPosition(final PacketContainer packet) {
        super(packet, WrapperPlayServerPosition.TYPE);
    }
    
    public double getX() {
        return this.handle.getDoubles().read(0);
    }
    
    public void setX(final double value) {
        this.handle.getDoubles().write(0, value);
    }
    
    public double getY() {
        return this.handle.getDoubles().read(1);
    }
    
    public void setY(final double value) {
        this.handle.getDoubles().write(1, value);
    }
    
    public double getZ() {
        return this.handle.getDoubles().read(2);
    }
    
    public void setZ(final double value) {
        this.handle.getDoubles().write(2, value);
    }
    
    public float getYaw() {
        return this.handle.getFloat().read(0);
    }
    
    public void setYaw(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getPitch() {
        return this.handle.getFloat().read(1);
    }
    
    public void setPitch(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    private StructureModifier<Set<PlayerTeleportFlag>> getFlagsModifier() {
        return (StructureModifier<Set<PlayerTeleportFlag>>)this.handle.getSets(EnumWrappers.getGenericConverter(WrapperPlayServerPosition.FLAGS_CLASS, (Class)PlayerTeleportFlag.class));
    }
    
    public Set<PlayerTeleportFlag> getFlags() {
        return this.getFlagsModifier().read(0);
    }
    
    public void setFlags(final Set<PlayerTeleportFlag> value) {
        this.getFlagsModifier().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.POSITION;
        FLAGS_CLASS = MinecraftReflection.getMinecraftClass("EnumPlayerTeleportFlags", "PacketPlayOutPosition$EnumPlayerTeleportFlags");
    }
    
    public enum PlayerTeleportFlag
    {
        X, 
        Y, 
        Z, 
        Y_ROT, 
        X_ROT
    }
}
