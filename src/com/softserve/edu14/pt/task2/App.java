package com.softserve.edu14.pt.task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt(x -> x)
                .summaryStatistics();

        System.out.printf("Count of all numbers: %d%n", stats.getCount());
        System.out.printf("Min number in List: %d%n", stats.getMin());
        System.out.printf("Max number in List: %d%n", stats.getMax());
        System.out.printf("Sum of all numbers: %d%n", stats.getSum());

    }
}
