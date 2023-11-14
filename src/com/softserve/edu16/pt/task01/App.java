package com.softserve.edu16.pt.task01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("src/com/softserve/edu16/pt/task01/mytext.txt"))
                .toArray(String[]::new);
        System.out.println("Lines length:");
        Arrays.stream(lines)
                .limit(20)
                .map(line -> line.length())
                .forEach(System.out::println);
        System.out.println("Line with maximal length: ");
        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("Not empty line with minimal length: ");
        Arrays.stream(lines)
                .filter(line -> !line.isEmpty())
                .min(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("Lines, which consist of word \"var\": ");
        Arrays.stream(lines)
                .filter(line -> line.contains("var"))
                .limit(20)
                .forEach(System.out::println);
    }
}
