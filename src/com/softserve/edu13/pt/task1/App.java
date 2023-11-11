package com.softserve.edu13.pt.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
        var list = Arrays.asList("Bob", "Babe", "Alice", "Karl", "Anton");
        list.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println(list);
    }
}
