package com.softserve.edu14.pt.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        var emptyStrngs = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println(emptyStrngs);
        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
        var list1 = list.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(","));
        System.out.println(list1);
    }
}
