// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import com.comphenix.protocol.reflect.IntEnum;
import java.util.UUID;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import com.comphenix.protocol.ProtocolLibrary;
import org.bukkit.entity.Entity;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.injector.PacketConstructor;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerSpawnEntity extends AbstractPacket
{
    public static final PacketType TYPE;
    private static PacketConstructor entityConstructor;
    
    public WrapperPlayServerSpawnEntity() {
        super(new PacketContainer(WrapperPlayServerSpawnEntity.TYPE), WrapperPlayServerSpawnEntity.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSpawnEntity(final PacketContainer packet) {
        super(packet, WrapperPlayServerSpawnEntity.TYPE);
    }
    
    public WrapperPlayServerSpawnEntity(final Entity entity, final int type, final int objectData) {
        super(fromEntity(entity, type, objectData), WrapperPlayServerSpawnEntity.TYPE);
    }
    
    private static PacketContainer fromEntity(final Entity entity, final int type, final int objectData) {
        if (WrapperPlayServerSpawnEntity.entityConstructor == null) {
            WrapperPlayServerSpawnEntity.entityConstructor = ProtocolLibrary.getProtocolManager().createPacketConstructor(WrapperPlayServerSpawnEntity.TYPE, entity, type, objectData);
        }
        return WrapperPlayServerSpawnEntity.entityConstructor.createPacket(entity, type, objectData);
    }
    
    public int getEntityID() {
        return this.handle.getIntegers().read(0);
    }
    
    public Entity getEntity(final World world) {
        return this.handle.getEntityModifier(world).read(0);
    }
    
    public Entity getEntity(final PacketEvent event) {
        return this.getEntity(event.getPlayer().getWorld());
    }
    
    public void setEntityID(final int value) {
        this.handle.getIntegers().write(0, value);
    }
    
    public UUID getUniqueId() {
        return this.handle.getUUIDs().read(0);
    }
    
    public void setUniqueId(final UUID value) {
        this.handle.getUUIDs().write(0, value);
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
    
    public double getOptionalSpeedX() {
        return this.handle.getIntegers().read(1) / 8000.0;
    }
    
    public void setOptionalSpeedX(final double value) {
        this.handle.getIntegers().write(1, (int)(value * 8000.0));
    }
    
    public double getOptionalSpeedY() {
        return this.handle.getIntegers().read(2) / 8000.0;
    }
    
    public void setOptionalSpeedY(final double value) {
        this.handle.getIntegers().write(2, (int)(value * 8000.0));
    }
    
    public double getOptionalSpeedZ() {
        return this.handle.getIntegers().read(3) / 8000.0;
    }
    
    public void setOptionalSpeedZ(final double value) {
        this.handle.getIntegers().write(3, (int)(value * 8000.0));
    }
    
    public float getPitch() {
        return this.handle.getIntegers().read(4) * 360.0f / 256.0f;
    }
    
    public void setPitch(final float value) {
        this.handle.getIntegers().write(4, (int)(value * 256.0f / 360.0f));
    }
    
    public float getYaw() {
        return this.handle.getIntegers().read(5) * 360.0f / 256.0f;
    }
    
    public void setYaw(final float value) {
        this.handle.getIntegers().write(5, (int)(value * 256.0f / 360.0f));
    }
    
    public int getType() {
        return this.handle.getIntegers().read(6);
    }
    
    public void setType(final int value) {
        this.handle.getIntegers().write(6, value);
    }
    
    public int getObjectData() {
        return this.handle.getIntegers().read(7);
    }
    
    public void setObjectData(final int value) {
        this.handle.getIntegers().write(7, value);
    }
    
    static {
        TYPE = PacketType.Play.Server.SPAWN_ENTITY;
    }
    
    public static class ObjectTypes extends IntEnum
    {
        public static final int BOAT = 1;
        public static final int ITEM_STACK = 2;
        public static final int AREA_EFFECT_CLOUD = 3;
        public static final int MINECART = 10;
        public static final int ACTIVATED_TNT = 50;
        public static final int ENDER_CRYSTAL = 51;
        public static final int TIPPED_ARROW_PROJECTILE = 60;
        public static final int SNOWBALL_PROJECTILE = 61;
        public static final int EGG_PROJECTILE = 62;
        public static final int GHAST_FIREBALL = 63;
        public static final int BLAZE_FIREBALL = 64;
        public static final int THROWN_ENDERPEARL = 65;
        public static final int WITHER_SKULL_PROJECTILE = 66;
        public static final int SHULKER_BULLET = 67;
        public static final int FALLING_BLOCK = 70;
        public static final int ITEM_FRAME = 71;
        public static final int EYE_OF_ENDER = 72;
        public static final int THROWN_POTION = 73;
        public static final int THROWN_EXP_BOTTLE = 75;
        public static final int FIREWORK_ROCKET = 76;
        public static final int LEASH_KNOT = 77;
        public static final int ARMORSTAND = 78;
        public static final int FISHING_FLOAT = 90;
        public static final int SPECTRAL_ARROW = 91;
        public static final int DRAGON_FIREBALL = 93;
        private static ObjectTypes INSTANCE;
        
        public static ObjectTypes getInstance() {
            return ObjectTypes.INSTANCE;
        }
        
        static {
            ObjectTypes.INSTANCE = new ObjectTypes();
        }
    }
}
