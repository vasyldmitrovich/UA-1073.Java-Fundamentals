package com.softserve.edu11.hw.task2;

import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with multiple spaces:");
        String sentence = scanner.nextLine();

        sentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Modified sentence: " + sentence);

        scanner.close();
    }
}
