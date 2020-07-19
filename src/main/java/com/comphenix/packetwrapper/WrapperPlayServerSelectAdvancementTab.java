// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerSelectAdvancementTab extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerSelectAdvancementTab() {
        super(new PacketContainer(WrapperPlayServerSelectAdvancementTab.TYPE), WrapperPlayServerSelectAdvancementTab.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSelectAdvancementTab(final PacketContainer packet) {
        super(packet, WrapperPlayServerSelectAdvancementTab.TYPE);
    }
    
    public MinecraftKey getKey() {
        return this.handle.getMinecraftKeys().readSafely(0);
    }
    
    public void setKey(final MinecraftKey key) {
        this.handle.getMinecraftKeys().writeSafely(0, key);
    }
    
    static {
        TYPE = PacketType.Play.Server.SELECT_ADVANCEMENT_TAB;
    }
}
