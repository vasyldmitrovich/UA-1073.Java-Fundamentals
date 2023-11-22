package com.softserve.edu14.pt.Task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics res = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();
        System.out.println("Count: " + res.getCount());
        System.out.println("Min: " + res.getMin());
        System.out.println("Max: " + res.getMax());
        System.out.println("Sum: " + res.getSum());
    }
}
