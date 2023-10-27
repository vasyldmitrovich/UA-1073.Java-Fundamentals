package com.softserve.edu10.hw.task01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        Set<String> stringSet1 = new HashSet<>(Arrays.asList("one", "two", "three", "four", "five"));
        Set<String> stringSet2 = new HashSet<>(Arrays.asList("three", "four", "five", "six", "seven"));
        System.out.println("Union result for Integer: " + union(integerSet1, integerSet2));
        System.out.println("Intersect result for Integer: " + intersect(integerSet1, integerSet2));
        System.out.println("Union result for String: " + union(stringSet1, stringSet2));
        System.out.println("Intersect result for String: " + intersect(stringSet1, stringSet2));
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> res = new HashSet<>(set1);
        res.addAll(set2);
        return res;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> res = new HashSet<>(set1);
        res.retainAll(set2);
        return res;
    }
}
