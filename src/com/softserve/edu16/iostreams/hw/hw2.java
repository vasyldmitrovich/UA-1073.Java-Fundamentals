package com.softserve.edu16.iostreams.hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw2 {
    public static void main(String[] args) {
        String fileName = "mytext.txt";
        String text = readTextFromFile(fileName);
        findAndOutputWordsStartingWithVowel(text);
        findAndOutputWordsWithMatchingLastAndFirstLetters(text);
    }

    private static String readTextFromFile(String fileName) {
        StringBuilder text = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text.toString();
    }

    private static void findAndOutputWordsStartingWithVowel(String text) {
        System.out.println("1) Words starting with a vowel:");
        Pattern pattern = Pattern.compile("\\b[aeiouAEIOU]\\w*\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println();
    }

    private static void findAndOutputWordsWithMatchingLastAndFirstLetters(String text) {
        System.out.println("2) Words where the last letter matches the first letter of the next word:");
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length - 1; i++) {
            String currentWord = words[i];
            String nextWord = words[i + 1];

            char lastCharCurrentWord = currentWord.charAt(currentWord.length() - 1);
            char firstCharNextWord = nextWord.charAt(0);

            if (Character.toLowerCase(lastCharCurrentWord) == Character.toLowerCase(firstCharNextWord)) {
                System.out.println(currentWord + " " + nextWord);
            }
        }
    }
}

