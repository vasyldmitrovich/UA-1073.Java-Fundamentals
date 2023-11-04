package com.softserve.edu13.pt.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class App {
    public static void main(String[] args) {
        System.out.println("The first Monday for current month is " + LocalDate.now().with(
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)
        ));
    }
}
