package com.itacademy.popravko.homeworks.competition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter
public class CrazyScientist {

    private String name;
    private Map<Detail, Integer> workshop;

    public int getMaxNumberOfRobots() {
        if (workshop.size() == 8) {
            return workshop.values().stream()
                    .mapToInt(Integer::intValue)
                    .min()
                    .getAsInt();
        }
        return 0;
    }

    public String getTheCraziest(CrazyScientist colleague) {
        return this.getMaxNumberOfRobots() > colleague.getMaxNumberOfRobots() ?
                this.name : colleague.name;
    }

}
