package com.softserve.edu14.pt.task1;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var list = List.of("adsf", "", "132", "", "asd");
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
