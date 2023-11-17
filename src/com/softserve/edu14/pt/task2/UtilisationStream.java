package com.softserve.edu14.pt.task2;
import java.util.Arrays;
import java.util.List;

public class UtilisationStream {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 4, 6, 9, 8, 7, 4, 1, 2, 3);
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
