package com.softserve.edu14.pt.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        long emptyStringCount = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.printf("Count of empty strings: %d%n", emptyStringCount);

        List<String> result = list.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.printf("List without empty strings: %s%n", result);

        String line = list.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.printf("Collected string: %s%n", line);

    }
}
