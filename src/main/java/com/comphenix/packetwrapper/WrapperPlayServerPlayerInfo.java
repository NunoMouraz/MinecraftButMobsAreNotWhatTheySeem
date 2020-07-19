// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.PlayerInfoData;
import java.util.List;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerPlayerInfo extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerPlayerInfo() {
        super(new PacketContainer(WrapperPlayServerPlayerInfo.TYPE), WrapperPlayServerPlayerInfo.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerPlayerInfo(final PacketContainer packet) {
        super(packet, WrapperPlayServerPlayerInfo.TYPE);
    }
    
    public EnumWrappers.PlayerInfoAction getAction() {
        return this.handle.getPlayerInfoAction().read(0);
    }
    
    public void setAction(final EnumWrappers.PlayerInfoAction value) {
        this.handle.getPlayerInfoAction().write(0, value);
    }
    
    public List<PlayerInfoData> getData() {
        return this.handle.getPlayerInfoDataLists().read(0);
    }
    
    public void setData(final List<PlayerInfoData> value) {
        this.handle.getPlayerInfoDataLists().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.PLAYER_INFO;
    }
}
