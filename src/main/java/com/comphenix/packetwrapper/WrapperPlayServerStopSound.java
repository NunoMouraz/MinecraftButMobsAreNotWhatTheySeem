// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerStopSound extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerStopSound() {
        super(new PacketContainer(WrapperPlayServerStopSound.TYPE), WrapperPlayServerStopSound.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerStopSound(final PacketContainer packet) {
        super(packet, WrapperPlayServerStopSound.TYPE);
    }
    
    public MinecraftKey getSoundEffect() {
        return this.handle.getMinecraftKeys().readSafely(0);
    }
    
    public void setSoundEffect(final MinecraftKey value) {
        this.handle.getMinecraftKeys().writeSafely(0, value);
    }
    
    public EnumWrappers.SoundCategory getCategory() {
        return this.handle.getSoundCategories().readSafely(0);
    }
    
    public void setCategory(final EnumWrappers.SoundCategory value) {
        this.handle.getSoundCategories().writeSafely(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.STOP_SOUND;
    }
}
