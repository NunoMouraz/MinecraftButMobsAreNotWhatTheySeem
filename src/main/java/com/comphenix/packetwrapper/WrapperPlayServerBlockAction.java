// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import org.bukkit.Material;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerBlockAction extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerBlockAction() {
        super(new PacketContainer(WrapperPlayServerBlockAction.TYPE), WrapperPlayServerBlockAction.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerBlockAction(final PacketContainer packet) {
        super(packet, WrapperPlayServerBlockAction.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public int getByte1() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setByte1(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public int getByte2() {
        return this.handle.getIntegers().read(1);
    }
    
    public void setByte2(final int value) {
        this.handle.getIntegers().write(1, value);
    }
    
    public Material getBlockType() {
        return this.handle.getBlocks().read(0);
    }
    
    public void setBlockType(final Material value) {
        this.handle.getBlocks().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.BLOCK_ACTION;
    }
}
