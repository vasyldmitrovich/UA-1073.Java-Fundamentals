package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var stats = primes.stream()
                .mapToInt(i -> i)
                .summaryStatistics();
        System.out.println("Min = " + stats.getMin());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Sum = " + stats.getSum());
    }
}
