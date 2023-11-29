package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fiveWords = scanner.nextLine();

        String[] words = fiveWords.split(" ");
        String longestWord = findLongestWord(words);
        System.out.println("Longest word: " + longestWord);

        int lettersCount = longestWord.length();
        System.out.println("Number of letters in the longest word: " + lettersCount);

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseString(secondWord);
            System.out.println("Second word backwards: " + reversedSecondWord);
        } else {
            System.out.println("There are not enough words in the sentence to output the second word backwards.");
        }

    }

    private static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
