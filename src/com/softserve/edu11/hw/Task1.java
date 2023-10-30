package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longWord = " ";
        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }

        System.out.println("The longer word in sentence is: " + longWord);

        int amountLetters = longWord.length();

        System.out.println("Amount of letters in this word is: " + amountLetters);

        String secondWord = words[1];
        StringBuilder reverseWord = new StringBuilder(secondWord).reverse();

        System.out.println("The second changed word: " + reverseWord);

    }
}
