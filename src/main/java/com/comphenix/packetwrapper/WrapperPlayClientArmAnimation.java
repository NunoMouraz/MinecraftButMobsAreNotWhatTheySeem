// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayClientArmAnimation extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayClientArmAnimation() {
        super(new PacketContainer(WrapperPlayClientArmAnimation.TYPE), WrapperPlayClientArmAnimation.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientArmAnimation(final PacketContainer packet) {
        super(packet, WrapperPlayClientArmAnimation.TYPE);
    }
    
    static {
        TYPE = PacketType.Play.Client.ARM_ANIMATION;
    }
}
