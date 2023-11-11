package com.softserve.edu14.pt.task02;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println(primes);
        var primesStats = primes.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println("Count: " + primesStats.getCount());
        System.out.println("Min: " + primesStats.getMin());
        System.out.println("Max: " + primesStats.getMax());
        System.out.println("Sum: " + primesStats.getSum());
    }
}
