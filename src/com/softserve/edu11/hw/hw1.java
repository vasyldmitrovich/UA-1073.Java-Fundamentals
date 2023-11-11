package com.softserve.edu11.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        String longestWord = findLongestWord(words);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWord.length());
        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseWord(secondWord);
            System.out.println("Second word in reverse order: " + reversedSecondWord);
        } else {
            System.out.println("Not enough words in the sentence to reverse the second word.");
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

    private static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}

