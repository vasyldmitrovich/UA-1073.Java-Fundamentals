package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(6);
        set2.add(7);

        OperationsOnSets<Integer> op = new OperationsOnSets<>();
        System.out.println("The result of the union: " + op.union(set1, set2));
        System.out.println("The result of the intersection: " + op.intersect(set1, set2));
    }
}
