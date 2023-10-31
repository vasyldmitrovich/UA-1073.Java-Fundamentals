package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        System.out.println("Today is " + LocalDate.now().getDayOfWeek());
        System.out.println("First MONDAY in this month was " + LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        List<String> list = Arrays.asList("Sarah", "John", "Peter", "Helen", "Anna");
        System.out.println("\nUnsorted list: " + list);
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list in ascending order: " + list);
        list.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted list in descending order: " + list);
        List<Integer> integerList = List.of(10, 23, 74, 40, 15, 66, 79, 18, 91, 10);
        System.out.println("\nList if integers: " + integerList);
        System.out.println("Total: " + count(integerList, e -> true));
        System.out.println("Even: " + count(integerList, e -> e % 2 == 0));
        System.out.println("Odd: " + count(integerList, e -> e % 2 != 0));
        System.out.println("Greater than 50: " + count(integerList, e -> e > 50));
    }

    private static int count(List<Integer> list, Predicate<Integer> filter) {
        int count = 0;
        for (var el : list) {
            if (filter.test(el)) {
                count++;
            }
        }
        return count;
    }
}
