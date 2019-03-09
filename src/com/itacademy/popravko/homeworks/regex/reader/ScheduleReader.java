package com.itacademy.popravko.homeworks.regex.reader;

import lombok.Builder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ScheduleReader {

    public List<String> getSplittedByDaysReadSchedule(File file) throws IOException {
        return Arrays.asList(readScheduleInString(file).split("Конец"));
    }

    private String readScheduleInString(File file) throws IOException {
        return Files.lines(file.toPath())
                .collect(Collectors.joining(" "));
    }
}
