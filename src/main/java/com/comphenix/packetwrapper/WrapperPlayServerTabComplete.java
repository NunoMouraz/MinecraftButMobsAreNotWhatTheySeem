// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.mojang.brigadier.suggestion.Suggestions;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerTabComplete extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerTabComplete() {
        super(new PacketContainer(WrapperPlayServerTabComplete.TYPE), WrapperPlayServerTabComplete.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTabComplete(final PacketContainer packet) {
        super(packet, WrapperPlayServerTabComplete.TYPE);
    }
    
    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }
    
    public void setTransactionId(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public Suggestions getSuggestions() {
        return (Suggestions)this.handle.getSpecificModifier((Class)Suggestions.class).read(0);
    }
    
    public void setSuggestions(final Suggestions value) {
        this.handle.getSpecificModifier((Class)Suggestions.class).write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.TAB_COMPLETE;
    }
}
