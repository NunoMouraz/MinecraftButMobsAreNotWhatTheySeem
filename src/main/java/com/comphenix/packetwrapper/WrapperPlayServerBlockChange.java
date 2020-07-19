// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedBlockData;
import org.bukkit.Location;
import org.bukkit.World;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerBlockChange extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerBlockChange() {
        super(new PacketContainer(WrapperPlayServerBlockChange.TYPE), WrapperPlayServerBlockChange.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerBlockChange(final PacketContainer packet) {
        super(packet, WrapperPlayServerBlockChange.TYPE);
    }
    
    public BlockPosition getLocation() {
        return this.handle.getBlockPositionModifier().read(0);
    }
    
    public void setLocation(final BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }
    
    public Location getBukkitLocation(final World world) {
        return this.getLocation().toVector().toLocation(world);
    }
    
    public WrappedBlockData getBlockData() {
        return this.handle.getBlockData().read(0);
    }
    
    public void setBlockData(final WrappedBlockData value) {
        this.handle.getBlockData().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.BLOCK_CHANGE;
    }
}
