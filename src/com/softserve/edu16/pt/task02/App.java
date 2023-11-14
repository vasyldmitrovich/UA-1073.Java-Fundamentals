package com.softserve.edu16.pt.task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("src/com/softserve/edu16/pt/task02/mytext.txt"))
                .toArray(String[]::new);
        Function<CharSequence, Stream<String>> splitter = Pattern.compile("[^a-zA-Z'-]+")::splitAsStream;
        String vowels = "aeiouy";
        System.out.println("Words, which begins from vowels:");
        Arrays.stream(lines)
                .flatMap(splitter)
                .filter(word -> !word.isBlank())
                .filter(word -> vowels.contains(word.substring(0, 1)))
                .limit(20)
                .forEach(System.out::println);
        System.out.println("Words pairs, for which the last letter of one word matches the first letter of the next word:");
        var wordIterator = Arrays.stream(lines)
                .flatMap(splitter)
                .filter(word -> !word.isEmpty())
                .limit(1000)
                .iterator();
        String prevWord = wordIterator.next();
        while (wordIterator.hasNext()) {
            String currentWord = wordIterator.next();
            if (currentWord.charAt(0) == prevWord.charAt(prevWord.length() - 1)) {
                System.out.println(prevWord + " - " + currentWord);
                prevWord = currentWord;
            }
        }
    }
}
