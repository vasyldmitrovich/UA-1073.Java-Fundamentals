package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {
        // Task 1
        showToday();

        // Task 2
        showFirstMonday();

        // Task 3
        List<String> stringList = Arrays.asList("Apple", "Banana", "Orange", "Melon", "Peach");
        sortStringList(stringList);

        // Task 4
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = count(integerArray, x -> x % 2 == 0);
        System.out.println("Count of even numbers: " + count);
    }

    // Task 1
    public static void showToday() {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Today is: " + dayOfWeek);
    }

    // Task 2
    public static void showFirstMonday() {
        LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);
        LocalDate firstMonday = firstDayOfMonth.with(DayOfWeek.MONDAY);
        System.out.println("First Monday of the month: " + firstMonday);
    }

    // Task 3
    public static void sortStringList(List<String> stringList) {
        System.out.println("Original list: " + stringList);
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + stringList);
    }

    // Task 4
    public static int count(Integer[] array, Predicate<Integer> condition) {
        int count = 0;
        for (int num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
}