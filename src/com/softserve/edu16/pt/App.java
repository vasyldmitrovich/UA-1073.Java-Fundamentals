package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

class App {
    public static void main(String[] args) throws IOException {

//PT 1
        Path pathToFile = Path.of("src/com/softserve/edu16/pt/White fang.txt");

        String[] strings;
        try (Stream<String> stream = Files.lines(pathToFile)) {
            strings = stream
                    .toArray(String[]::new);

        }

//PT 1.1 - count and write the number of symbols in every line.
        int[] length = Arrays.stream(strings)
                .limit(50)
                .mapToInt(String::length)
                .toArray();
        System.out.println(Arrays.toString(length));

//PT 1.2 - find the longest and the shortest line (min is equivalent 1 - to avoid empty string (I also can use .isBlank method)).

        IntSummaryStatistics statistics = Arrays.stream(strings)
                .filter(line -> !line.isBlank())
                .mapToInt(String::length)
                .summaryStatistics();
        System.out.println("\nThe longest lines contains - " + statistics.getMax() + " symbols:");
        Arrays.stream(strings)
                .filter(line -> line.length() == statistics.getMax())
                .forEach(System.out::println);

// I have problem here - after running program, its shows that there are two line with the same length
//but first line - "    This eBook is for th..." contains spaces, and i don't know why...
// please explain me how to avoid this trouble. TY!)
        System.out.println("\nThe shortest lines contains - " + statistics.getMin() + " symbols:");
        Arrays.stream(strings)
                .filter(line -> line.length() == statistics.getMin())
                .forEach(System.out::println);

//PT 1.3 - find and write only that lines, which consist of word «var»
        System.out.println("\n" + "-".repeat(50) + "\nLines, that consist of word «var»:");
        Arrays.stream(strings)
                .filter(line -> line.contains("var"))
                .forEach(s -> System.out.println("Line : \"" + s + "\""));


//PT 2.1 - find and output to the console all words starting with a vowel.
        Pattern pattern = Pattern.compile("[^a-zA-Z'-]+");
        String vowels = "AEIOYU";
        List<String> vowelsList = Arrays.stream(strings)
                .flatMap(pattern::splitAsStream)
                .filter(word -> !word.isBlank())
                .filter(word -> vowels.contains(word.substring(0, 1)))
                .toList();
        System.out.println("\n" + "-".repeat(50) + "\nAll words starting with a vowel:" );
        vowelsList.stream()
                .limit(10)
                .forEach(System.out::println);


//PT 2.2 - find and output to the console all words for which the last letter of one word
//matches the first letter of the next word.

        Iterator<String> iterator = Arrays.stream(strings)
                .flatMap(pattern::splitAsStream)
                .filter(word -> !word.isBlank())
                .iterator();

        String previousWord = iterator.next();
        char lastChar = previousWord.charAt(previousWord.length() - 1);
        List<String> listOfConclusion = new ArrayList<>();

        while (iterator.hasNext()) {
            String nextWord = iterator.next();
            if (nextWord.charAt(0) == lastChar) {
                listOfConclusion.add(previousWord + " " + nextWord);
            }
            previousWord = nextWord;
            lastChar = previousWord.charAt(previousWord.length() - 1);
        }

        System.out.println("\n" + "-".repeat(50) + "\nPairs of words for which the last letter of one word\n" +
                "matches the first letter of the next word:");
        listOfConclusion.stream()
                .limit(10)
                .forEach(System.out::println);
    }
}
