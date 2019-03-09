package com.itacademy.popravko.homeworks.regex.makers;

import com.itacademy.popravko.homeworks.regex.activity.Activity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FormatScheduleMaker {

    public List<String> getFormatSchedule(List<List<Activity>> week) {
        return week.stream()
                .flatMap(day -> Stream.concat(day.stream().map(Activity::toString), Stream.of(" ")))
                .collect(Collectors.toList());
    }
}
