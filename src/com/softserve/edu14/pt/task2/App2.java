package com.softserve.edu14.pt.task2;

import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 19);
        var stats = list.stream()
                .mapToInt(i -> i)
                .summaryStatistics();
        System.out.println("min = " + stats.getMin());
        System.out.println("max = " + stats.getMax());
        System.out.println("count = " + stats.getCount());
        System.out.println("sum = " + stats.getSum());

    }
}
