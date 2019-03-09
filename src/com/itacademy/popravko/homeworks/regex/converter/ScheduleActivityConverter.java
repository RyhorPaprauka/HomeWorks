package com.itacademy.popravko.homeworks.regex.converter;

import com.itacademy.popravko.homeworks.regex.activity.Activity;
import com.itacademy.popravko.homeworks.regex.activity.ActivityType;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static com.itacademy.popravko.homeworks.regex.activity.ActivityType.BREAK;
import static com.itacademy.popravko.homeworks.regex.activity.ActivityType.EXERCISES;
import static com.itacademy.popravko.homeworks.regex.activity.ActivityType.LECTURE;
import static com.itacademy.popravko.homeworks.regex.activity.ActivityType.SOLVING;

public class ScheduleActivityConverter {

    private static final String ACTIVITY_FORMAT = "(?<start>([01][0-9]|2[0-3]):[0-5][0-9])\\s(?<name>([А-Я][а-я]+)" +
            "(\\s[а-я]+)*)\\s(?<end>([01][0-9]|2[0-3]):[0-5][0-9])";

    public List<List<Activity>> turnWeekToActivityLists(List<String> week) {
        return week.stream()
                .map(this::turnDayToActivityList)
                .collect(Collectors.toList());
    }

    private List<Activity> turnDayToActivityList(String day) {
        List<Activity> dayActivity = new ArrayList<>();
        Matcher matcher = Pattern.compile(ACTIVITY_FORMAT).matcher(day);

        for (int i = 0; i < day.length(); ) {
            matcher.region(i, day.length());
            if (matcher.find()) {
                Activity activity = Activity.builder()
                        .name(matcher.group("name"))
                        .start(matcher.group("start"))
                        .end(matcher.group("end"))
                        .type(defineActivityType(matcher.group("name")))
                        .build();
                dayActivity.add(activity);
                i += matcher.group().length() - matcher.group("end").length();
            } else {
                break;
            }
        }
        return dayActivity;
    }

    private ActivityType defineActivityType(String name) {
        switch (name) {
            case "Упражнения":
                return EXERCISES;
            case "Перерыв":
            case "Обеденный перерыв":
                return BREAK;
            case "Решения":
                return SOLVING;
            default:
                return LECTURE;
        }
    }
}
