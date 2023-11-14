package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

class App {


    public static void main(String[] args) {

//HW 1 - Show which today is a day of a week

        LocalDate today = LocalDate.now();
        DayOfWeek todayDay = today.getDayOfWeek();
        System.out.println("Todays is - " + todayDay);

//HW 2 - Show a date of first Monday for current month

        System.out.println("Date of the first Monday for current month is - " +
                today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)).getDayOfMonth());

//HW 3 - Write a method for sorting list of Strings using Java 8

        List<String> list = Arrays.asList("Jessica", "Bob", "Jeniffer", "Tyson", "Rob", "Alice", "Jack", "Mark");
        System.out.println(list);
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(list);
        list.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(list);

//HW 4 - Array og Integers

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("In the given array, quantity of even numbers is - " +
                count(array, el -> el % 2 == 0));
        System.out.println("In the given array, quantity of odd numbers is - " +
                count(array, el -> el % 2 == 1));
        System.out.println("In the given array, quantity of numbers divided by '3' is - " +
                count(array, el -> el % 3 == 0));
    }


    static int count(int[] array, Predicate<Integer> condition) {
        int count = 0;
        for (int el : array) {
            if (condition.test(el)) {
                count++;
            }
        }
        return count;
    }
}
