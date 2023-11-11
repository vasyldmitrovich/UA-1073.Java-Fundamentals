package com.softserve.edu14.pt.task01;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var list = List.of("John", "", "Anna", "Boris", "", "", "Diana", "Willy", "Antony", "");
        System.out.println(list);
        var countEmpty = list.stream()
                .filter(s -> s.isEmpty())
                .count();
        System.out.println("There are " + countEmpty + " empty strings in this list");
        var noEmptyList = list.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println(noEmptyList);
        var noEmptyString = noEmptyList.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(noEmptyString);
    }
}
