package com.softserve.edu13.pt.task4;

import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{6, 4, 8, 2, 1, 7, 0, 3, 4, 5};

        System.out.println("Count of even numbers: " + count(array, e -> e % 2 == 0));
        System.out.println("Count of odd numbers: " + count(array, e -> e % 2 == 1));
        System.out.println("Count of numbers greater than 5: " + count(array, e -> e > 5));
    }

    public static int count(Integer[] arr, Predicate<Integer> condition) {
        int count = 0;
        for (var number : arr) {
            if (condition.test(number)) {
                count++;
            }
        }
        return count;
    }
}
