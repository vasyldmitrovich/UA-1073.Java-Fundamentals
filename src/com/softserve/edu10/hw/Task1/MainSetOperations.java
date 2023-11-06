package com.softserve.edu10.hw.Task1;

import java.util.Set;
import java.util.HashSet;

public class MainSetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to set1 and set2
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Test union operation
        Set<Integer> unionResult = SetOperations.union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionResult);

        // Test intersection operation
        Set<Integer> intersectionResult = SetOperations.intersect(set1, set2);
        System.out.println("Intersection of set1 and set2: " + intersectionResult);
    }
}
