package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class OperationsOnSets<T> {
    public Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

}
