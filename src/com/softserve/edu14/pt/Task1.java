package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        var countOfEmptyStrings = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println(countOfEmptyStrings);
        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
        var joined = list.stream()
                .map(String::toUpperCase)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(","));
        System.out.println(joined);
    }
}
