package com.softserve.edu14.pt.task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics statistics = primes.stream()
                .mapToInt(x -> x)
                .summaryStatistics();

        System.out.println("Input list: " + primes);
        System.out.println("The number of elements: " + statistics.getCount());
        System.out.println("Lowest number in list : " + statistics.getMin());
        System.out.println("Highest number in list : " + statistics.getMax());
        System.out.println("Sum of all numbers : " + statistics.getSum());
    }
}
