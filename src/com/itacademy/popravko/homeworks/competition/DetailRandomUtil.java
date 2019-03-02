package com.itacademy.popravko.homeworks.competition;

import java.util.List;
import java.util.Random;

public class DetailRandomUtil {

    public static final Random RANDOM = new Random();
    public static final int MAX_DETAIL_NUMBER = 4;

    private DetailRandomUtil() {
    }

    public static int getRandomDetailsNumber() {
        return RANDOM.nextInt(MAX_DETAIL_NUMBER);
    }

    public static Detail getRandomDetailFromList(List<Detail> dump) {
        int x = RANDOM.nextInt(dump.size());
        return dump.get(x);
    }

    public static Detail getRandomDetail(Class<Detail> clazz) {
        int x = RANDOM.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
