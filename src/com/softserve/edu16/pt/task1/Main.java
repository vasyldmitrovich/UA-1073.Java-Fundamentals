package com.softserve.edu16.pt.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));
    private static final String PATH_TO_DIRECTORY = System.getProperty("user.dir");
    private static final String PATH_PACKAGE = PATH_TO_DIRECTORY + "/src/com/softserve/edu16/pt/task1/";
    private static final String PATH_FILE = "mytext.txt";

    public static void main(String[] args) {

        try (var streamLines = Files.lines(Path.of(PATH_PACKAGE + PATH_FILE))) {
            String[] lines = streamLines.toArray(String[]::new);

            printCountNumSymbolInEveryLine(lines);
            printLongestAndShortLine(lines);
            printLinesWithWord(lines, "bandit");
        } catch (IOException e) {
            LOG.info("The file " + PATH_FILE + " could not be opened");
        }
    }

    private static void printCountNumSymbolInEveryLine(String[] lines){
        int[] counter = {1};

        System.out.printf("%s %s%n", "Line num", "Count symbols");

        Arrays.stream(lines)
                .map(String::length)
                .forEach(length -> System.out.printf("%5d %9d%n", counter[0]++, length));

        System.out.println();
    }

    private static void printLongestAndShortLine(String[] lines){
        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(line -> System.out.println("The longest line in the text: " + line));

        System.out.println();

        Arrays.stream(lines)
                .min(Comparator.comparing(String::length))
                .ifPresent(line -> System.out.println("The shortest line in the text: " + (line.isEmpty() ? "Empty string" : line)));

        System.out.println();
    }

    private static void printLinesWithWord(String[] lines, String word){
        System.out.printf("Lines containing the word: %s%n", word);

        Arrays.stream(lines)
               .filter(line -> line.contains(word))
               .forEach(System.out::println);

        System.out.println();
    }
}
