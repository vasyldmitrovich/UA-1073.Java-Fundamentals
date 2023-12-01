package com.softserve.edu14.pt.Task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(100, 99, 80, 25, 18, 111);
        var stats = number.stream()
                .mapToInt(i -> i)
                .summaryStatistics();

        System.out.println("min " + stats.getMin());
        System.out.println("max " + stats.getMax());
        System.out.println("count " + stats.getCount());
        System.out.println("suma " + stats.getSum());
        System.out.println("average " + stats.getAverage());

    }
}