package com.itacademy.popravko.homeworks.regex;

import com.itacademy.popravko.homeworks.regex.writers.FormatScheduleWriter;
import com.itacademy.popravko.homeworks.regex.writers.FullReportWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) throws IOException {

        File file = Paths.get("resources", "log-file.txt").toFile();

        FormatScheduleWriter formatSchedule = new FormatScheduleWriter();
        FullReportWriter fullReport = new FullReportWriter();

        formatSchedule.writeFormatSchedule(file);
        fullReport.writeScheduleFullReport(file);

    }
}
