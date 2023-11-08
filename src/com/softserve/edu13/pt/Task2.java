package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static void main (String[] args) {
        var localDate = LocalDate.now();
        var firstMondayAccessor = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        var firstMonday = localDate.with(firstMondayAccessor);

        System.out.println(firstMonday);
    }
}
