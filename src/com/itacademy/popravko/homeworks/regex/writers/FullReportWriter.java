package com.itacademy.popravko.homeworks.regex.writers;

import com.itacademy.popravko.homeworks.regex.reader.ScheduleReader;
import com.itacademy.popravko.homeworks.regex.converter.ScheduleActivityConverter;
import com.itacademy.popravko.homeworks.regex.makers.FullReportMaker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FullReportWriter {

    public void writeScheduleFullReport(File file) throws IOException {
        Path path = Paths.get(file.getParent(), file.getName()+"-report.txt");

        ScheduleReader reader =  new ScheduleReader();
        ScheduleActivityConverter converter = new ScheduleActivityConverter();
        FullReportMaker maker = new FullReportMaker();

        List<String> fullReport = maker.getFullReport(
                converter.turnWeekToActivityLists(
                        reader.getSplittedByDaysReadSchedule(file)));

        Files.write(path, fullReport, UTF_8);
    }
}
