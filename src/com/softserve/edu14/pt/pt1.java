package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pt1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long emptyStringsCount = countEmptyStrings(list);
        System.out.println("Number of empty strings: " + emptyStringsCount);
        List<String> nonEmptyList = removeEmptyStrings(list);
        System.out.println("List without empty strings: " + nonEmptyList);
        String joinedUppercaseStrings = convertToUppercaseAndJoin(list);
        System.out.println("Uppercase strings joined with comma: " + joinedUppercaseStrings);
    }

    private static long countEmptyStrings(List<String> list) {
        return list.stream().filter(String::isEmpty).count();
    }

    private static List<String> removeEmptyStrings(List<String> list) {
        return list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }

    private static String convertToUppercaseAndJoin(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }
}

