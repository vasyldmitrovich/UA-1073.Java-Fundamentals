package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task1 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Enter sentence of 5 words");

        String sentence = SCANNER.nextLine();


        // Task1
        String longestWord = findLongestWord(sentence);

        System.out.println("The longest word is " + longestWord);

        // Task2
        System.out.println("Number of letters is " + longestWord.length());

        String secondWord = reverseSecondWord(sentence);
        System.out.println(secondWord);
    }

    public static String findLongestWord (String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        return longestWord;
    }

    public static String reverseSecondWord (String str) {
        String[] words = str.split(" ");
        char[] second = words[1].toCharArray();


        reverseArray(second);
        return String.valueOf(second);
    }

    public static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
