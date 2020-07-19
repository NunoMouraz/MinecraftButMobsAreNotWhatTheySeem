// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerRecipes extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerRecipes() {
        super(new PacketContainer(WrapperPlayServerRecipes.TYPE), WrapperPlayServerRecipes.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRecipes(final PacketContainer packet) {
        super(packet, WrapperPlayServerRecipes.TYPE);
    }
    
    public Action getAction() {
        return (Action)this.handle.getEnumModifier((Class)Action.class, 0).readSafely(0);
    }
    
    public void setAction(final Action value) {
        this.handle.getEnumModifier((Class)Action.class, 0).writeSafely(0, value);
    }
    
    public boolean getCraftingBookOpen() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setCraftingBookOpen(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public boolean getFilteringCraftable() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setFilteringCraftable(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.RECIPES;
    }
    
    public enum Action
    {
        INIT, 
        ADD, 
        REMOVE
    }
}
