package com.pinoco.minecraftbutmobsarenotwhattheyseem.helpers;

import org.bukkit.Sound;

import java.util.ArrayList;

public class SoundHelper {

    public static Sound getRandomSound() {
        return (Sound) ListHelper.getRandomElement(Sound.values());
    }

    public static Sound getRandomMonsterAmbientSound() {
        ArrayList<Sound> sounds = new ArrayList<>();
        sounds.add(Sound.ENTITY_ZOMBIE_AMBIENT);
        sounds.add(Sound.ENTITY_SKELETON_AMBIENT);
        sounds.add(Sound.ENTITY_BLAZE_AMBIENT);
        sounds.add(Sound.ENTITY_DROWNED_AMBIENT);
        sounds.add(Sound.ENTITY_ENDERMAN_AMBIENT);
        sounds.add(Sound.ENTITY_ENDERMITE_AMBIENT);
        sounds.add(Sound.ENTITY_EVOKER_AMBIENT);
        sounds.add(Sound.ENTITY_GHAST_AMBIENT);
        sounds.add(Sound.ENTITY_GUARDIAN_AMBIENT);
        sounds.add(Sound.ENTITY_HUSK_AMBIENT);
        sounds.add(Sound.ENTITY_ILLUSIONER_AMBIENT);
        sounds.add(Sound.ENTITY_PHANTOM_AMBIENT);
        sounds.add(Sound.ENTITY_PILLAGER_AMBIENT);
        sounds.add(Sound.ENTITY_RAVAGER_AMBIENT);
        sounds.add(Sound.ENTITY_WITHER_SKELETON_AMBIENT);
        sounds.add(Sound.ENTITY_ELDER_GUARDIAN_AMBIENT);
        return (Sound) ListHelper.getRandomElement(sounds);
    }
}
