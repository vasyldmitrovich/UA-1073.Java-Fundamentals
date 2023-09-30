package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class Faculty {

    Seasons currentSeason;
    int number;

    public Faculty(int numberOfStudents, Seasons currentSeason) {
        this.number = numberOfStudents;
        this.currentSeason = currentSeason;

    }

    @Override
    public String toString() {
        return "Faculty " + number + ", Seasons " + currentSeason;
    }
}
