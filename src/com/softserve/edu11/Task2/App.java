package com.softserve.edu11.Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence with multiple spaces: ");
        String inputSentence = scanner.nextLine();

        String cleanedSentence = inputSentence.replaceAll("\\s+", " ");

        System.out.println("Result: " + cleanedSentence);

        scanner.close();
    }
}

