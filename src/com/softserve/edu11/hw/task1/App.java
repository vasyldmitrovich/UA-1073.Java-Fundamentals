package com.softserve.edu11.hw.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s");

        String theLongestWord = getTheLongestWord(words);
        System.out.println("The longest word is: " + theLongestWord);

        System.out.println("The number of letters in the longest word: " + theLongestWord.length());

        System.out.println("Reversed second word: " + new StringBuilder(words[1]).reverse());
    }

    public static String getTheLongestWord(String[] words) {
        int theLongestIdx = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[theLongestIdx].length() < words[i].length()) {
                theLongestIdx = i;
            }
        }
        return words[theLongestIdx];
    }

}
