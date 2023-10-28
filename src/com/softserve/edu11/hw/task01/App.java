package com.softserve.edu11.hw.task01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter word %d: ", i + 1);
            words[i] = scanner.nextLine();
        }
        int index = longestWordIndex(words);
        System.out.printf("The word '%s' has maximal length %d symbols%n", words[index], words[index].length());
        System.out.printf("Reversed 2-nd word: %s%n", new StringBuilder(words[1]).reverse());
    }

    public static int longestWordIndex(String[] words) {
        int maxLength = words[0].length();
        int maxIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
