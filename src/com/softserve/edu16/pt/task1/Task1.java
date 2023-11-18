package com.softserve.edu16.pt.task1;

import com.softserve.global.Global;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    private static final String PATH_PACKAGE = Global.getPath("/src/com/softserve/edu16/pt");

    public static void main(String[] args) {
        try {
            String[] lines = Files.lines(Path.of(PATH_PACKAGE + "/alice.txt")).toArray(String[]::new);
            printLineSize(lines);
            printLineWithMaxSize(lines);
            printLineContainsVar(lines);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void printLineSize(String[] lines) {
        Arrays.stream(lines)
                .limit(20)
                .map(String::length)
                .forEach(System.out::println);
    }

    public static void printLineWithMaxSize(String[] lines) {
        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        ;
    }

    public static void printLineContainsVar(String[] lines) {
        Arrays.stream(lines)
                .filter(l -> l.contains("var"))
                .forEach(System.out::println);
    }
}
