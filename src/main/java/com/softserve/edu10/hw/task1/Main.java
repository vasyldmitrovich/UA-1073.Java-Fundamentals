package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(2);
        setB.add(3);
        setB.add(4);

        Set<Integer> unionResult = union(setA, setB);
        System.out.println("Union: " + unionResult);

        Set<Integer> intersectResult = intersect(setA, setB);
        System.out.println("Intersection: " + intersectResult);
    }
}
