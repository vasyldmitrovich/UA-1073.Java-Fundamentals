package com.softserve.edu16.IOStreamі.pt.task1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("C:/workplace/Courses/12345.txt"))
                .toArray(String[]::new);
        Arrays.stream(lines)
                .limit(20)
                .map(line -> line.length())
                .forEach(System.out::println);
        System.out.println("Longest line");
        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("Shortest line");
        Arrays.stream(lines)
                .min(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("Lines which contains var");
        Arrays.stream(lines)
                .filter(line -> line.contains("var"))
                .forEach(System.out::println);
    }
}
