package com.softserve.edu11.hw.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = scanner.nextLine();
        String editedText = removeExtraSpaces(text);
        System.out.println("Edited text: " + editedText);
    }

    public static String removeExtraSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
