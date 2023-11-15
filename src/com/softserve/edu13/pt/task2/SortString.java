package com.softserve.edu13.pt.task2;

import java.util.Arrays;

public class SortString {
    public static void task2() {
        var list = Arrays.asList("Bon", "Ivan", "Argon");
        System.out.println("Original list " + list);
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted lisr " + list);


    }
}



