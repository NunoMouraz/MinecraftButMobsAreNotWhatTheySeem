// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedParticle;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerWorldParticles extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerWorldParticles() {
        super(new PacketContainer(WrapperPlayServerWorldParticles.TYPE), WrapperPlayServerWorldParticles.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerWorldParticles(final PacketContainer packet) {
        super(packet, WrapperPlayServerWorldParticles.TYPE);
    }
    
    public WrappedParticle getParticle() {
        return this.handle.getNewParticles().read(0);
    }
    
    public void setParticleType(final WrappedParticle value) {
        this.handle.getNewParticles().write(0, value);
    }
    
    public float getX() {
        return this.handle.getFloat().read(0);
    }
    
    public void setX(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getY() {
        return this.handle.getFloat().read(1);
    }
    
    public void setY(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    public float getZ() {
        return this.handle.getFloat().read(2);
    }
    
    public void setZ(final float value) {
        this.handle.getFloat().write(2, value);
    }
    
    public float getOffsetX() {
        return this.handle.getFloat().read(3);
    }
    
    public void setOffsetX(final float value) {
        this.handle.getFloat().write(3, value);
    }
    
    public float getOffsetY() {
        return this.handle.getFloat().read(4);
    }
    
    public void setOffsetY(final float value) {
        this.handle.getFloat().write(4, value);
    }
    
    public float getOffsetZ() {
        return this.handle.getFloat().read(5);
    }
    
    public void setOffsetZ(final float value) {
        this.handle.getFloat().write(5, value);
    }
    
    public float getParticleData() {
        return this.handle.getFloat().read(6);
    }
    
    public void setParticleData(final float value) {
        this.handle.getFloat().write(6, value);
    }
    
    public int getNumberOfParticles() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setNumberOfParticles(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public boolean getLongDistance() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setLongDistance(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.WORLD_PARTICLES;
    }
}
