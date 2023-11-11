package com.softserve.edu11.hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a sentence with words separated by more than one space:");
        String sentence = scanner.nextLine();
        String updatedSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("Updated sentence: " + updatedSentence);
    }
}
