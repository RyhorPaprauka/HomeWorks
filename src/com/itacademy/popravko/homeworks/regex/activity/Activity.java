package com.itacademy.popravko.homeworks.regex.activity;

import lombok.Builder;
import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.itacademy.popravko.homeworks.regex.Constants.MINUTES_IN_HOUR;

@Getter
@Builder
public class Activity {

    private static final String TIME_FORMAT = "^(?<hours>[01][0-9]|2[0-3]):(?<minutes>[0-5][0-9])$";
    private String name;
    private String start;
    private String end;
    private ActivityType type;

    @Override
    public String toString() {
        return start + "-" + end + " " + name;
    }

    public int getDuration() {
        Matcher startMatcher = Pattern.compile(TIME_FORMAT).matcher(start);
        Matcher endMatcher = Pattern.compile(TIME_FORMAT).matcher(end);
        startMatcher.matches();
        endMatcher.matches();

        int startTime = (Integer.parseInt(startMatcher.group("hours")) * MINUTES_IN_HOUR)
                + Integer.parseInt(startMatcher.group("minutes"));
        int endTime = (Integer.parseInt(endMatcher.group("hours")) * MINUTES_IN_HOUR)
                + Integer.parseInt(endMatcher.group("minutes"));

        return endTime - startTime;
    }
}
