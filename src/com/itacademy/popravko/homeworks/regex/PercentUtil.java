package com.itacademy.popravko.homeworks.regex;

public final class PercentUtil {

    private static final int WHOLE_PERCENT = 100;

    private PercentUtil() {
    }

    public static int getPercent(int part, int whole){
        return (part*WHOLE_PERCENT)/whole;
    }
}
