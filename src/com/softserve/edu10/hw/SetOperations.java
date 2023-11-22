package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("orange");
        set1.add("apple");
        set1.add("orange");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("blueberry");
        set2.add("strawberry");

        Set<String> unionSet = union(set1, set2);
        System.out.println("Union of sets: " + unionSet);

        Set<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);

        Set<Integer> intSet2 = new HashSet<>();
        intSet2.add(2);
        intSet2.add(4);
        intSet2.add(6);

        Set<Integer> intersectionSet = intersect(intSet1, intSet2);
        System.out.println("Intersection of sets: " + intersectionSet);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>();
        for (T element : set1) {
            if (set2.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }
}