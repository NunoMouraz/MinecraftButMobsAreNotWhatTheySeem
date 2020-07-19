package com.pinoco.minecraftbutmobsarenotwhattheyseem.helpers;

import java.util.List;
import java.util.Random;

public class ListHelper {

    private static final Random rng = new Random();

    public static Object getRandomElement(List list) {
        return list.get(rng.nextInt(list.size()));
    }

    public static Object getRandomElement(Object[] array) {
        return array[rng.nextInt(array.length)];
    }
}
