package com.softserve.edu10.hw;

import java.util.*;

class FirstHW {
    static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new TreeSet<>(set1);
        union.addAll(set2);
        return union;
    }

    static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> union = new TreeSet<>(set1);
        union.retainAll(set2);
        return union;
    }
}
