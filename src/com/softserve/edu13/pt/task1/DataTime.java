package com.softserve.edu13.pt.task1;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class DataTime {
    public static void task1() {

        var day = LocalDate.now().getDayOfWeek();
        System.out.println("Day of the week: " + day);

        var dayOfMount = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First Monday in month: " + dayOfMount);

    }
}



