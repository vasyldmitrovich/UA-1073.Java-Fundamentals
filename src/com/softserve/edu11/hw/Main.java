package com.softserve.edu11.hw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть речення з п'яти слів:");
        String sentence = scanner.nextLine();
        String longestWord = "";
        int longestWordLength = 0;
        for (String word : sentence.split(" ")) {
            if (word.length() > longestWordLength) {
                longestWord = word;
                longestWordLength = word.length();
            }
        }

        System.out.println("Найдовше слово в реченні: " + longestWord);
        System.out.println("Кількість букв у найдовшому слові: " + longestWordLength);
        String secondWord = sentence.split(" ")[1];
        String reversedSecondWord = "";
        for (int i = secondWord.length() - 1; i >= 0; i--) {
            reversedSecondWord += secondWord.charAt(i);
        }
        System.out.println("Друге слово речення у зворотному порядку: " + reversedSecondWord);
    }
}