package com.pinoco.minecraftbutmobsarenotwhattheyseem;

import com.comphenix.packetwrapper.WrapperPlayServerNamedSoundEffect;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.pinoco.minecraftbutmobsarenotwhattheyseem.helpers.SoundHelper;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        ProtocolManager pm = ProtocolLibrary.getProtocolManager();
        pm.addPacketListener(
                new PacketAdapter(this, ListenerPriority.NORMAL, PacketType.Play.Server.NAMED_SOUND_EFFECT) {
                    @Override
                    public void onPacketSending(PacketEvent event) {

                        // Item packets (id: 0x29)
                        if (event.getPacketType() == PacketType.Play.Server.NAMED_SOUND_EFFECT) {

                            // If is hostile sound
                            boolean valid = false;
                            for (EnumWrappers.SoundCategory sc : event.getPacket().getSoundCategories().getValues()) {
                                if (sc == EnumWrappers.SoundCategory.HOSTILE) {
                                    valid = true;
                                    break;
                                }
                            }

                            if (valid) {
                                WrapperPlayServerNamedSoundEffect nse = new WrapperPlayServerNamedSoundEffect(event.getPacket());
                                nse.setSoundEffect(SoundHelper.getRandomMonsterAmbientSound());
                                event.setPacket(nse.getHandle());
                            }
                        }
                    }
                }
        );

    }
}
