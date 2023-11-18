package com.softserve.edu16.pt.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        String[] lines = Files.lines(Path.of("src/com/softserve/edu16/pt/mytext.txt")).toArray(String[]::new);
        String vowels = "aioeu";
        Function<CharSequence, Stream<String>> splitter = Pattern.compile("[^A-Za-z-']+")::splitAsStream;
        Arrays.stream(lines)
                .flatMap(splitter)
                .filter(w -> !w.isBlank())
                .filter(e -> vowels.contains(e.substring(0, 1).toLowerCase()))
                .forEach(System.out::println);


        var wordIterator = Arrays.stream(lines)
                .flatMap(splitter)
                .filter(w -> !w.isBlank())
                .iterator();
        StringBuilder previousWord = new StringBuilder(wordIterator.next());
        while (wordIterator.hasNext()) {
            String next = wordIterator.next();
            if (next.charAt(0) == previousWord.charAt(previousWord.length() - 1)) {
                System.out.println(previousWord + " " + next);
            }
            previousWord = new StringBuilder(next);
        }

    }
}