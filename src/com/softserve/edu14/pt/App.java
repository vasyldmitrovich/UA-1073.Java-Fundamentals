package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class App {
    public static void main(String[] args) {

//PT 1
        List<String> list = Arrays.asList("bla", "", "simp", "", "second",
                "third", "third", "sec", "blablabla");
        System.out.println("We have next list:\n" + list);

//PT 1.1
        long count = list
                .stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("\nThis list contains " + count + " empty strings");

//PT 1.2
        List<String> listWithoutEmpty = list
                .stream()
                .filter(i -> !i.isEmpty()).toList();
        System.out.println("\nThis is how list will look up without empty strings:\n"
                + listWithoutEmpty);

//PT 1.3
        String stringToUppercase = list
                .stream()
                .collect(Collectors.joining(", "));
        System.out.println("\nThis is how list will look up with Upper case and joining with coma's:\n"
                + stringToUppercase);

//PT 2
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes
                .stream()
                .mapToInt(i -> i).summaryStatistics();
        System.out.println("-".repeat(30) + "\nOur collection 'primes':\n" + primes);
        System.out.println("Elements in our collection - " + stats.getCount());
        System.out.println("Minimum value in our collection - " + stats.getMin());
        System.out.println("Maximum value in our collection - " + stats.getMax());
        System.out.println("Sum of all integers in collection - " + stats.getSum());

    }
}
