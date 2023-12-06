package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDate.now().with(
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)
        ));


        var list = Arrays.asList("Alice", "Bob");
        list.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(list);
    }
}
