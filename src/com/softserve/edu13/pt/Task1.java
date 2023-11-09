package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDate.now().with(
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        List<String> list = Arrays.asList("Alice", "Bob");
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println(list);
    }
}
