// 
// Decompiled by Procyon v0.5.36
// 

package com.comphenix.packetwrapper;

import java.util.Date;
import org.bukkit.inventory.ItemStack;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.advancement.Advancement;
import com.comphenix.protocol.wrappers.Converters;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.BukkitConverters;
import java.util.Set;
import com.comphenix.protocol.reflect.EquivalentConverter;
import com.comphenix.protocol.wrappers.MinecraftKey;
import java.util.Map;
import java.util.Optional;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.AutoWrapper;
import com.comphenix.protocol.PacketType;

public class WrapperPlayServerAdvancements extends AbstractPacket
{
    public static final PacketType TYPE;
    private static final AutoWrapper<AdvancementDisplay> DISPLAY;
    private static final AutoWrapper<SerializedAdvancement> WRAPPER;
    private static final AutoWrapper<CriterionProgress> CRITERION;
    private static final AutoWrapper<AdvancementProgress> PROGRESS;
    
    public WrapperPlayServerAdvancements() {
        super(new PacketContainer(WrapperPlayServerAdvancements.TYPE), WrapperPlayServerAdvancements.TYPE);
        this.handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAdvancements(final PacketContainer packet) {
        super(packet, WrapperPlayServerAdvancements.TYPE);
    }
    
    public boolean isReset() {
        return this.handle.getBooleans().read(0);
    }
    
    public void setReset(final boolean value) {
        this.handle.getBooleans().write(0, value);
    }
    
    public Optional<Map<MinecraftKey, SerializedAdvancement>> getAdvancements() {
        return (Optional<Map<MinecraftKey, SerializedAdvancement>>)this.handle.getMaps(MinecraftKey.getConverter(), (EquivalentConverter)WrapperPlayServerAdvancements.WRAPPER).optionRead(0);
    }
    
    public void setAdvancements(final Map<MinecraftKey, SerializedAdvancement> value) {
        this.handle.getMaps(MinecraftKey.getConverter(), (EquivalentConverter)WrapperPlayServerAdvancements.WRAPPER).writeSafely(0, value);
    }
    
    public Optional<Set<MinecraftKey>> getKeys() {
        return this.handle.getSets(MinecraftKey.getConverter()).optionRead(0);
    }
    
    public void setKeys(final Set<MinecraftKey> value) {
        this.handle.getSets(MinecraftKey.getConverter()).writeSafely(0, value);
    }
    
    public Optional<Map<MinecraftKey, AdvancementProgress>> getProgress() {
        return (Optional<Map<MinecraftKey, AdvancementProgress>>)this.handle.getMaps(MinecraftKey.getConverter(), (EquivalentConverter)WrapperPlayServerAdvancements.PROGRESS).optionRead(1);
    }
    
    static {
        TYPE = PacketType.Play.Server.ADVANCEMENTS;
        DISPLAY = AutoWrapper.wrap((Class)AdvancementDisplay.class, "AdvancementDisplay").field(0, BukkitConverters.getWrappedChatComponentConverter()).field(1, BukkitConverters.getWrappedChatComponentConverter()).field(2, BukkitConverters.getItemStackConverter()).field(3, MinecraftKey.getConverter()).field(4, EnumWrappers.getGenericConverter(MinecraftReflection.getMinecraftClass("AdvancementFrameType"), (Class)FrameType.class));
        WRAPPER = AutoWrapper.wrap((Class)SerializedAdvancement.class, "Advancement$SerializedAdvancement").field(0, MinecraftKey.getConverter()).field(1, BukkitConverters.getAdvancementConverter()).field(2, WrapperPlayServerAdvancements.DISPLAY);
        CRITERION = AutoWrapper.wrap((Class)CriterionProgress.class, "CriterionProgress");
        PROGRESS = AutoWrapper.wrap((Class)AdvancementProgress.class, "AdvancementProgress").field(0, BukkitConverters.getMapConverter(Converters.passthrough((Class)String.class), WrapperPlayServerAdvancements.CRITERION));
        WrapperPlayServerAdvancements.CRITERION.field(0, WrapperPlayServerAdvancements.PROGRESS);
    }
    
    public static class SerializedAdvancement
    {
        public MinecraftKey key;
        public Advancement advancement;
        public AdvancementDisplay display;
        public Object rewards;
        public Map<String, Object> criteria;
        public String[][] requirements;
    }
    
    public static class AdvancementDisplay
    {
        public WrappedChatComponent title;
        public WrappedChatComponent description;
        public ItemStack icon;
        public MinecraftKey background;
        public FrameType frame;
        public boolean showToast;
        public boolean announceToChat;
        public boolean hidden;
        public float xCoord;
        public float yCoord;
    }
    
    public enum FrameType
    {
        TASK, 
        CHALLENGE, 
        GOAL
    }
    
    public static class AdvancementProgress
    {
        public Map<String, CriterionProgress> progress;
        public String[][] array2d;
    }
    
    public static class CriterionProgress
    {
        public AdvancementProgress progress;
        public Date date;
    }
}
