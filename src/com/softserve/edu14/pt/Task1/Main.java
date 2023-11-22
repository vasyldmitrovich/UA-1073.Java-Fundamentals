package com.softserve.edu14.pt.Task1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        var empty = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println(empty);
        System.out.println("-".repeat(20));
        list.stream()
                .filter(el -> !el.isEmpty())
                .forEach(System.out::println);
        System.out.println("-".repeat(20));
       var str =  list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(str);

    }
}
