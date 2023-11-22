package com.softserve.edu016.pt;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("C:/Users/Khrystyna/Desktop/mytext.txt"))
                .toArray(String[]::new);
        Arrays.stream(lines)
                .limit(20)
                .map(line -> line.length())
                .forEach(System.out::println);

        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        Arrays.stream(lines)
                .filter(line -> line.contains("var"))
                .forEach(System.out::println);
    }
}
