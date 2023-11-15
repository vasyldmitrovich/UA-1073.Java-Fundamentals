package com.softserve.edu13.pt.task3;

import java.util.List;
import java.util.function.Predicate;

public class CountMethod {
    public static void task3() {
        var ints = List.of(1, 2, 3, 5, 6, 8, 7);
        System.out.println("Total: " + count(ints, e -> true));
        System.out.println("Doubles: " + count(ints, e -> e % 2 == 0));
        System.out.println("Odd: " + count(ints, e -> e % 2 == 1));
        System.out.println("Greater than 3: " + count(ints, e -> e >= 4));

    }

    static int count(List<Integer> list, Predicate<Integer> filter) {
        int suma = 0;
        for (var el : list) {
            if (filter.test(el)) {
                suma++;
            }
        }
        return suma;

    }

}
