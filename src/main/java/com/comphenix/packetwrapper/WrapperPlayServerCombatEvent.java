// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerCombatEvent extends AbstractPacket
{
    public static final PacketType TYPE;
    
    public WrapperPlayServerCombatEvent() {
        super(new PacketContainer(WrapperPlayServerCombatEvent.TYPE), WrapperPlayServerCombatEvent.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCombatEvent(final PacketContainer packet) {
        super(packet, WrapperPlayServerCombatEvent.TYPE);
    }
    
    public EnumWrappers.CombatEventType getEvent() {
        return this.handle.getCombatEvents().read(0);
    }
    
    public void setEvent(final EnumWrappers.CombatEventType value) {
        this.handle.getCombatEvents().write(0, value);
    }
    
    public int getDuration() {
        if (this.getEvent() != EnumWrappers.CombatEventType.END_COMBAT) {
            throw new IllegalStateException("Duration only exists for END_COMBAT");
        }
        return this.handle.getIntegers().read(0);
    }
    
    public void setDuration(final int value) {
        if (this.getEvent() != EnumWrappers.CombatEventType.END_COMBAT) {
            throw new IllegalStateException("Duration only exists for END_COMBAT");
        }
        this.handle.getIntegers().write(0, value);
    }
    
    public int getPlayerID() {
        if (this.getEvent() != EnumWrappers.CombatEventType.ENTITY_DIED) {
            throw new IllegalStateException("Player ID only exists for ENTITY_DEAD");
        }
        return this.handle.getIntegers().read(0);
    }
    
    public void setPlayerId(final int value) {
        if (this.getEvent() != EnumWrappers.CombatEventType.ENTITY_DIED) {
            throw new IllegalStateException("Player ID only exists for ENTITY_DEAD");
        }
        this.handle.getIntegers().write(0, value);
    }
    
    public int getEntityID() {
        final EnumWrappers.CombatEventType event = this.getEvent();
        switch (event) {
            case END_COMBAT:
            case ENTITY_DIED: {
                return this.handle.getIntegers().read(1);
            }
            default: {
                throw new IllegalStateException("Entity ID does not exist for " + event);
            }
        }
    }
    
    public void setEntityId(final int value) {
        final EnumWrappers.CombatEventType event = this.getEvent();
        switch (event) {
            case END_COMBAT:
            case ENTITY_DIED: {
                this.handle.getIntegers().write(1, value);
                break;
            }
        }
        throw new IllegalStateException("Entity ID does not exist for " + event);
    }
    
    public String getMessage() {
        if (this.getEvent() != EnumWrappers.CombatEventType.ENTITY_DIED) {
            throw new IllegalStateException("Message only exists for ENTITY_DEAD");
        }
        return this.handle.getStrings().read(0);
    }
    
    public void setMessage(final String value) {
        if (this.getEvent() != EnumWrappers.CombatEventType.ENTITY_DIED) {
            throw new IllegalStateException("Message only exists for ENTITY_DEAD");
        }
        this.handle.getStrings().write(0, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.COMBAT_EVENT;
    }
}
