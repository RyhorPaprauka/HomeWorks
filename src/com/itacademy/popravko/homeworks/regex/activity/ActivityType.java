package com.itacademy.popravko.homeworks.regex.activity;

import lombok.Getter;

@Getter
public enum ActivityType {

    EXERCISES("Упражнения"),
    BREAK("Перерыв"),
    SOLVING("Решения"),
    LECTURE("Лекции");

    private String name;

    ActivityType(String name) {
        this.name = name;
    }
}
