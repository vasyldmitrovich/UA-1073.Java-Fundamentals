package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    private static final Random RANDOM = new Random();
    private static final String BORDER = "-".repeat(120);
    public static void main(String[] args) {
        var now = LocalDate.now();

        System.out.printf("%s%n", BORDER);
        printDayToday(now);
        printFirstMondayDate(now);
        sortList();
        filterList();
    }

    private static void printDayToday(LocalDate now){
        var weekDay = now.getDayOfWeek();
        var date = now.format(DateTimeFormatter.ISO_DATE);

        System.out.printf("Today is %s, %s%n", date, weekDay);
        System.out.printf("%s%n", BORDER);
    }

    private static void printFirstMondayDate(LocalDate now){
        var firstMonday = now.with(
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)
        );

        System.out.printf("Date of the first Monday of the current month: %s%n", firstMonday);
        System.out.printf("%s%n", BORDER);
    }

    private static void sortList() {
        var list = Arrays.asList("In", "the", "village", "there", "is", "a", "military", "presidio", "with", "Spanish", "soldiers", "and", "their", "horses");

        System.out.println("List to be sorted: " + list);
        list.sort(Comparator.comparing(String::toLowerCase));
        System.out.println("Sorted list: " + list);
        System.out.printf("%s%n", BORDER);
    }

    private static void filterList(){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; ++i){
            list.add(RANDOM.nextInt(-100, 100));
        }

        System.out.println("List: " + list);
        System.out.println("\tThere are " + count(list, e -> true));
        System.out.println("\tEven " + count(list, e -> e % 2 == 0));
        System.out.println("\tOdd " + count(list, e -> e % 2 != 0));

        System.out.printf("%s%n", BORDER);
    }

    private static long count(List<Integer> list, Predicate<Integer> filter){
        return list.stream().filter(filter).count();
    }
}
