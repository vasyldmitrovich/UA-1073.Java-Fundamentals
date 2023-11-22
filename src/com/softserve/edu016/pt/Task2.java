package com.softserve.edu016.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("C:/Users/Khrystyna/Desktop/mytext.txt"))
                .toArray(String[]::new);
        Function<CharSequence, Stream<String>> splitter =
                Pattern.compile("[^a-zA-Z'-]+")::splitAsStream;
        String vowels = "ioueay";
        Arrays.stream(lines)
                .limit(100)
                .flatMap(splitter)
                .filter(w -> !w.isBlank())
                .filter(w -> vowels.contains(w.substring(0, 1)))
                .forEach(System.out::println);

        ;
    }
}
