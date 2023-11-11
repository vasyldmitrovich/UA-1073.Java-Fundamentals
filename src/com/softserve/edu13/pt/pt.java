package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class pt {
    public static void main(String[] args) {
        showCurrentDayOfWeek();
        showFirstMondayDate();
        List<String> stringList = Arrays.asList("Banana", "Apple", "Orange", "Grapes", "Kiwi");
        sortStringList(stringList);
        System.out.println("Sorted String List: " + stringList);
        Integer[] ina = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = count(ina, x -> x % 2 == 0);
        System.out.println("Count of even numbers in the array: " + count);
    }

    private static void showCurrentDayOfWeek() {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Today is: " + dayOfWeek);
    }

    private static void showFirstMondayDate() {
        LocalDate currentDate = LocalDate.now();
        LocalDate firstMonday = currentDate.withDayOfMonth(1);

        while (firstMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMonday = firstMonday.plusDays(1);
        }

        System.out.println("Date of the first Monday for the current month: " + firstMonday);
    }

    private static void sortStringList(List<String> stringList) {
        Collections.sort(stringList);
    }

    private static int count(Integer[] array, Predicate<Integer> condition) {
        int count = 0;
        for (Integer num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
}

