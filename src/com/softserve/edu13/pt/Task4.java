package com.softserve.edu13.pt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,2,6);

        System.out.println(count(list, v -> v < 2));
        System.out.println(count(list, v -> v % 2 == 0));
    }

    static int count(List<Integer> list, Predicate<Integer> condition) {
        var filteredList = list.stream().filter(condition);

        return filteredList.toList().size();
    }
}
