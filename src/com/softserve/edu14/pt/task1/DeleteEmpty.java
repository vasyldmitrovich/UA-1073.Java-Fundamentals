package com.softserve.edu14.pt.task1;

import java.util.List;

public class DeleteEmpty {
    public static void main(String[] args) {

        var list = List.of("Boni", "", "sgdbs", "bhs", "kjmkj", "", "yirkjedy", "");
        var empty = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Original list: " + list + "\n");
        System.out.println("count empty: " + empty + "\n");

        System.out.println("Not empty: ");
        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("In uppercase");
        list.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

    }
}
