package com.softserve.edu13.pt.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDate.now().with(
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)
        ));
    }

}

