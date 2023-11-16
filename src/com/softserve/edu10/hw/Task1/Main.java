package com.softserve.edu10.hw.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1000);
        setA.add(2111);
        setA.add(333);

        setB.add(2213);
        setB.add(31122);
        setB.add(8363);

        Set<Integer> unionResult = SetOperations.union(setA, setB);
        Set<Integer> intersectResult = SetOperations.intersect(setA, setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectResult);
    }
}

