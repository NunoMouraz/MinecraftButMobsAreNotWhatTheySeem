// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientAbilities extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientAbilities() {
        super(new PacketContainer(WrapperPlayClientAbilities.TYPE), WrapperPlayClientAbilities.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientAbilities(final PacketContainer packet) {
        super(packet, WrapperPlayClientAbilities.TYPE);
    }
    
    public boolean isInvulnerable() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setInvulnerable(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    @Deprecated
    public boolean isInvulnurable() {
        return this.handle.getBooleans().read(0);
    }
    
    @Deprecated
    public void setInvulnurable(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public boolean isFlying() {
        return this.handle.getBooleans().read(1);
    }
    
    public void setFlying(final boolean value) {
        this.handle.getBooleans().write(1, value);
    }
    
    public boolean canFly() {
        return this.handle.getBooleans().read(2);
    }
    
    public void setCanFly(final boolean value) {
        this.handle.getBooleans().write(2, value);
    }
    
    public boolean canInstantlyBuild() {
        return this.handle.getBooleans().read(3);
    }
    
    public void setCanInstantlyBuild(final boolean value) {
        this.handle.getBooleans().write(3, value);
    }
    
    public float getFlyingSpeed() {
        return this.handle.getFloat().read(0);
    }
    
    public void setFlyingSpeed(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getWalkingSpeed() {
        return this.handle.getFloat().read(1);
    }
    
    public void setWalkingSpeed(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    static {
        TYPE = PacketType.Play.Client.ABILITIES;
    }
}
