package com.softserve.edu10.task1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        union(new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14)), new HashSet<>(Set.of(7,8,9,10,11,12,13,14)));
        intersection(new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14)), new HashSet<>(Set.of(7,8,9,10,11,12,13,14)));
    }
    public static void union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        System.out.println("Union: ");
        System.out.println(set1);
    }
    public static void intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : set1) {
            for (Integer j : set2) {
                if (i.equals(j)) {
                    result.add(i);
                }
            }
        }

        System.out.println("Intersection: ");
        System.out.println(result);

    }

}
