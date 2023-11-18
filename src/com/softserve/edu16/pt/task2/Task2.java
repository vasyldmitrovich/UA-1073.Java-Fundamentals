package com.softserve.edu16.pt.task2;

import com.softserve.global.Global;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task2 {
    private static final String PATH_PACKAGE = Global.getPath("/src/com/softserve/edu16/pt");
    private static final Function<CharSequence, Stream<String>> SPLITTER = Pattern.compile("[^a-zA-Z'-]")::splitAsStream;

    public static void main(String[] args) {
        try {
            var lines = Files.lines(Path.of(PATH_PACKAGE + "/alice.txt")).toArray(String[]::new);
            printLineStartWithVowel(lines);
            printWordFirstLastMatch(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printLineStartWithVowel(String[] lines) {
        String vowels = "ioueay";
        Arrays
                .stream(lines)
                .limit(100)
                .flatMap(SPLITTER)
                .filter(i -> !i.isBlank())
                .filter(i -> vowels.contains(i.substring(0, 1)))
                .forEach(System.out::println);
    }

    public static void printWordFirstLastMatch(String[] lines) {
        Iterator<String> iterator = Arrays
                .stream(lines)
                .flatMap(SPLITTER)
                .limit(200)
                .filter(i -> !i.isBlank())
                .iterator();


        String prev = iterator.next();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.charAt(0) == prev.charAt(prev.length() - 1)) {
                System.out.println(prev + " " + next);
            }
        }
    }
}
