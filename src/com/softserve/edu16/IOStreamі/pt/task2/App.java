package com.softserve.edu16.IOStreamі.pt.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        var words = Files.lines(Path.of("C:/workplace/Courses/12345.txt"))
                .toArray(String[]::new);
        Function<CharSequence, Stream<String>> splitter = Pattern.compile("[^a-zA-Z`-]+")::splitAsStream;
        String vowels = "eyuioa";
        Arrays.stream(words)
                .limit(100)
                .flatMap(splitter)
                .filter(w -> !w.isBlank())
                .filter(w -> vowels.contains(w.substring(0,1)))
                .forEach(System.out::println);
        System.out.println("================");
        var wordIterator = Arrays.stream(words)
                .flatMap(splitter)
                .limit(500)
                .filter(w -> !w.isEmpty())
                .iterator();
        String prev = wordIterator.next();
        while (wordIterator.hasNext()){
            String next = wordIterator.next();
            if (next.charAt(0) == prev.charAt(prev.length() - 1)){
                System.out.println(prev + " " + next);
            }
            prev = next;
        }

    }
}
