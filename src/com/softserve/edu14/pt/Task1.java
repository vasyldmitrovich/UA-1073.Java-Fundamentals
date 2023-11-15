package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "sec", "blablabla");

        long emptyStrings = list.stream().filter(String::isEmpty).count();
        List<String> withoutEmpty = list.stream().filter(i -> !i.isEmpty()).toList();
        String uppercaseString = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));

        System.out.println(emptyStrings);
        System.out.println(withoutEmpty);
        System.out.println(uppercaseString);
    }
}
