package com.softserve.edu11.Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter another sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s");

        String theLongestWord = findTheLongestWord(words);
        System.out.println("The longest word is: " + theLongestWord);

        System.out.println("The number of letters in the longest word: " + theLongestWord.length());

        System.out.println("Modified second word: " + modifySecondWord(words[1]));
    }

    public static String findTheLongestWord(String[] words) {
        int longestIdx = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[longestIdx].length() < words[i].length()) {
                longestIdx = i;
            }
        }
        return words[longestIdx];
    }

    public static String modifySecondWord(String secondWord) {
        return new StringBuilder(secondWord).reverse().toString();
    }
}
