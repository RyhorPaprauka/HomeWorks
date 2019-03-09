package com.itacademy.popravko.homeworks.regex.makers;

import com.itacademy.popravko.homeworks.regex.PercentUtil;
import com.itacademy.popravko.homeworks.regex.activity.Activity;
import com.itacademy.popravko.homeworks.regex.activity.ActivityType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.itacademy.popravko.homeworks.regex.activity.ActivityType.LECTURE;

public class FullReportMaker {

    public List<String> getFullReport(List<List<Activity>> week) {
        List<String> fullReport = week.stream()
                .map(this::getDayReport)
                .flatMap(day -> Stream.concat(day.stream(), Stream.of(" ")))
                .collect(Collectors.toList());

        fullReport.add("Лекции:");
        fullReport.addAll(getLecturesWeekReport(week));
        return fullReport;
    }

    private List<String> getLecturesWeekReport(List<List<Activity>> week) {
        int lecturesDuration = week.stream()
                .flatMap(day -> day.stream().filter(activity -> activity.getType() == LECTURE))
                .mapToInt(Activity::getDuration)
                .sum();

        return week.stream()
                .flatMap(day -> day.stream().filter(activity -> activity.getType() == LECTURE))
                .map(activity -> (activity.getName() + ": " +
                        activity.getDuration() + " минут " +
                        PercentUtil.getPercent(activity.getDuration(), lecturesDuration) + "%"))
                .collect(Collectors.toList());
    }

    private List<String> getDayReport(List<Activity> day) {
        int dayDuration = day.stream()
                .mapToInt(Activity::getDuration)
                .sum();

        return reduceDayByType(day).entrySet().stream()
                .map(activity -> (activity.getKey().getName() + ": " +
                        activity.getValue() + " минут " +
                        PercentUtil.getPercent(activity.getValue(), dayDuration) + "%"))
                .collect(Collectors.toList());

    }

    private Map<ActivityType, Integer> reduceDayByType(List<Activity> day) {
        return day.stream()
                .collect(Collectors.toMap(Activity::getType, Activity::getDuration,
                        (value1, value2) -> value1 + value2));
    }
}
