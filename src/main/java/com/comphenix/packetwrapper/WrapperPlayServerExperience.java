// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerExperience extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerExperience() {
        super(new PacketContainer(WrapperPlayServerExperience.TYPE), WrapperPlayServerExperience.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerExperience(final PacketContainer packet) {
        super(packet, WrapperPlayServerExperience.TYPE);
    }
    
    public float getExperienceBar() {
        return this.handle.getFloat().read(0);
    }
    
    public void setExperienceBar(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public int getLevel() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setLevel(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public int getTotalExperience() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTotalExperience(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.EXPERIENCE;
    }
}
