package com.softserve.edu11.hw.task1;

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        int longestWordLength = 0;

        for (String word : words) {
            if (word.length() > longestWordLength) {
                longestWord = word;
                longestWordLength = word.length();
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWordLength);

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();
            System.out.println("Second word in reverse order: " + reversedSecondWord);
        } else {
            System.out.println("The sentence doesn't contain a second word.");
        }
    }
}
