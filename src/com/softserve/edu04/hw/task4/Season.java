package com.softserve.edu04.hw.task4;

public enum Season {//Good
    FIRST_SEASON("summer"), SECOND_SEASON("spring"),
    THIRD_SEASON("winter"), FOURTH_SEASON("autumn");

    private final String engName;

    Season(String engName) {
        this.engName = engName;
    }

    public String getEngName() {
        return engName;
    }
}
