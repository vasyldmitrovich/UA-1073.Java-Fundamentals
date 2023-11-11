package com.softserve.edu11.hw.task1;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1Main {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Enter a sentence of at least five words:");

        String sentence = scan.nextLine();

        String[] words = sentence.split("\\s");

        String longWord = "";
        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println("Longest word:" + longWord.toUpperCase()
                + "\nNumber of characters:" + longWord.length());

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversWord = reversString(secondWord);
            System.out.println("Reverse second word: " + reversWord.toUpperCase());
        } else {
            System.out.println("Error");
        }
        scan.close();


    }

    private static String reversString(String input) {
        StringBuilder revers = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            revers.append(input.charAt(i));

        }
        return revers.toString();
    }
}
