package com.softserve.edu10.hw.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> unionResult = union(set1, set2);
        Set<Integer> intersectResult = intersect(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectResult);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Map<T, Integer> elementCounts = new HashMap<>();
        for (T element : set1) {
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
        }
        for (T element : set2) {
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
        }

        Set<T> result = new HashSet<>();
        for (Map.Entry<T, Integer> entry : elementCounts.entrySet()) {
            result.add(entry.getKey());
        }

        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Map<T, Integer> elementCounts = new HashMap<>();
        for (T element : set1) {
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
        }

        Set<T> result = new HashSet<>();
        for (T element : set2) {
            if (elementCounts.containsKey(element) && elementCounts.get(element) > 0) {
                result.add(element);
                elementCounts.put(element, elementCounts.get(element) - 1);
            }
        }

        return result;
    }
}

//Discrete Math :)
