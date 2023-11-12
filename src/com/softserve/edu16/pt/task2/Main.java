package com.softserve.edu16.pt.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));
    private static final Function<CharSequence, Stream<String>> SPLITTER = Pattern.compile("[^a-zA-Z'-]+")::splitAsStream;
    private static final String PATH_TO_DIRECTORY = System.getProperty("user.dir");
    private static final String PATH_PACKAGE = PATH_TO_DIRECTORY + "/src/com/softserve/edu16/pt/task2/";
    private static final String PATH_FILE = "mytext.txt";

    public static void main(String[] args) {
        try (var streamLines = Files.lines(Path.of(PATH_PACKAGE + PATH_FILE))) {
            String[] lines = streamLines.toArray(String[]::new);

            printAllWordsStartingWithVowel(lines);
            printAllWordsLastLetterMatchersFirstLetterNextWord(lines);
        } catch (IOException e) {
            LOG.info("The file " + PATH_FILE + " could not be opened");
        }
    }

    private static void printAllWordsStartingWithVowel(String[] lines){
        String vowels = "aeiouy";

        String result = Arrays.stream(lines)
                .flatMap(SPLITTER)
                .filter(word -> !word.isBlank())
                .filter(word -> vowels.contains(word.substring(0, 1)))
                .collect(Collectors.joining(", "));

        System.out.print("All words that begin with a vowel letter: \n\t");
        System.out.println(result);
        System.out.println();
    }

    private static void printAllWordsLastLetterMatchersFirstLetterNextWord(String[] lines){
        System.out.print("All words for which the last letter of one word matches the first letter of the next word:\n");

        var iterator = Arrays.stream(lines)
                .flatMap(SPLITTER)
                .filter(word -> !word.isBlank())
                .iterator();

        String prevWord = iterator.next();

        while (iterator.hasNext()){
            String current = iterator.next();

            if(prevWord.charAt(prevWord.length() - 1) == current.charAt(0)){
                System.out.printf("\t%s - %s%n", prevWord, current);
            }

            prevWord = current;
        }
        System.out.println();
    }
}
