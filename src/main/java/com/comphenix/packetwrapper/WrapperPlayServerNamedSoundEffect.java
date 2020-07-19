// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import org.bukkit.Sound;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerNamedSoundEffect extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerNamedSoundEffect() {
        super(new PacketContainer(WrapperPlayServerNamedSoundEffect.TYPE), WrapperPlayServerNamedSoundEffect.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerNamedSoundEffect(final PacketContainer packet) {
        super(packet, WrapperPlayServerNamedSoundEffect.TYPE);
    }
    
    public Sound getSoundEffect() {
        return this.handle.getSoundEffects().read(0);
    }
    
    public void setSoundEffect(final Sound value) {
        this.handle.getSoundEffects().write(0, value);
    }
    
    public EnumWrappers.SoundCategory getSoundCategory() {
        return this.handle.getSoundCategories().read(0);
    }
    
    public void setSoundCategory(final EnumWrappers.SoundCategory value) {
        this.handle.getSoundCategories().write(0, value);
    }
    
    public int getEffectPositionX() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setEffectPositionX(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getEffectPositionY() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setEffectPositionY(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public int getEffectPositionZ() {
        return this.handle.getIntegers().read(2);
    }
    
    public void setEffectPositionZ(final int value) {
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
        TYPE = PacketType.Play.Server.NAMED_SOUND_EFFECT;
    }
}
