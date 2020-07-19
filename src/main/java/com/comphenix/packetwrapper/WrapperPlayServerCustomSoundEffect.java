// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerCustomSoundEffect extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerCustomSoundEffect() {
        super(new PacketContainer(WrapperPlayServerCustomSoundEffect.TYPE), WrapperPlayServerCustomSoundEffect.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCustomSoundEffect(final PacketContainer packet) {
        super(packet, WrapperPlayServerCustomSoundEffect.TYPE);
    }
    
    public MinecraftKey getSoundName() {
        return this.handle.getMinecraftKeys().read(0);
    }
    
    public void setSoundName(final MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }
    
    public EnumWrappers.SoundCategory getSoundCategory() {
        return this.handle.getSoundCategories().read(0);
    }
    
    public void setSoundCategory(final EnumWrappers.SoundCategory value) {
        this.handle.getSoundCategories().write(0, value);
    }
    
    public int getX() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setX(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getY() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setY(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public int getZ() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setZ(final int value) {
        this.handle.getIntegers().write(2, value);
    }
    
    public float getVolume() {
        return this.handle.getFloat().read(0);
    }
    
    public void setVolume(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getPitch() {
        return this.handle.getFloat().read(1);
    }
    
    public void setPitch(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.CUSTOM_SOUND_EFFECT;
    }
}
