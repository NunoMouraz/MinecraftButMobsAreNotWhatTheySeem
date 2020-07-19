// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.BlockPosition;
import java.util.List;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerExplosion extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerExplosion() {
        super(new PacketContainer(WrapperPlayServerExplosion.TYPE), WrapperPlayServerExplosion.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerExplosion(final PacketContainer packet) {
        super(packet, WrapperPlayServerExplosion.TYPE);
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
    
    public float getRadius() {
        return this.handle.getFloat().read(0);
    }
    
    public void setRadius(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public List<BlockPosition> getRecords() {
        return this.handle.getBlockPositionCollectionModifier().read(0);
    }
    
    @Deprecated
    public List<BlockPosition> getRecors() {
        return this.handle.getBlockPositionCollectionModifier().read(0);
    }
    
    public void setRecords(final List<BlockPosition> value) {
        this.handle.getBlockPositionCollectionModifier().write(0, value);
    }
    
    public float getPlayerVelocityX() {
        return this.handle.getFloat().read(0);
    }
    
    public void setPlayerVelocityX(final float value) {
        this.handle.getFloat().write(0, value);
    }
    
    public float getPlayerVelocityY() {
        return this.handle.getFloat().read(1);
    }
    
    public void setPlayerVelocityY(final float value) {
        this.handle.getFloat().write(1, value);
    }
    
    public float getPlayerVelocityZ() {
        return this.handle.getFloat().read(2);
    }
    
    public void setPlayerVelocityZ(final float value) {
        this.handle.getFloat().write(2, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.EXPLOSION;
    }
}
