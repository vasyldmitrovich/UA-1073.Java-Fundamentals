package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectSet = new HashSet<>();
        for (int element : set1) {
            if (set2.contains(element)) {
                intersectSet.add(element);
            }
        }
        return intersectSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Intersection of set1 and set2:" + intersectSet);

    }

}



