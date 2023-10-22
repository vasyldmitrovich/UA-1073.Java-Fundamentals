package com.softserve.edu10.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static <T> Set<T> union (Set<T> set1, Set<T> set2) {
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
