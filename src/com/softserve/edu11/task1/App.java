package com.softserve.edu11.task1;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        findLongestWord(sentence);

    }
    public static void findLongestWord(String sentence) {

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: '" + longestWord + "'");
        System.out.println("Max letters: " + longestWord.length());

        StringBuilder reverseWord = new StringBuilder(words[1]);
        System.out.println(reverseWord.reverse());
    }

}
