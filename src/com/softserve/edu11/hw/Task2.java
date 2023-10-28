package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Enter sentence");
        String sentence = SCANNER.nextLine();

        System.out.println("Format sentence: " + replaceMultipleSpaces(sentence));


    }
    public static String replaceMultipleSpaces(String str) {
        return str.replaceAll("\\s+", " ");
    }
}
