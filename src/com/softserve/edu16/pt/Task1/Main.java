package com.softserve.edu16.pt.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
       var lines = Files.lines(Path.of("mytext.txt"))
                .toArray(String[]::new);
        Arrays.stream(lines)
                .map(String::length)
                .forEach(System.out::println);
        System.out.println("The longest line");
        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("The shortest line");
        Arrays.stream(lines)
                .min(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("contain VAR");
        Arrays.stream(lines)
                .filter(line -> line.contains("var"))
                .forEach(System.out::println);
    }
}
