package com.softserve.edu11.task4;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter first and last name: ");
        greet();
    }
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] greetings = new String[]{
                "Hello!",
                "Good day!",
                "Greetings!",
                "Hi there!",
                "Welcome!",
                "Have a nice day!",
                "Best wishes!"
        };
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.matches("[a-zA-Z]+ [a-zA-Z]+-?[a-zA-Z]*")) {

                System.out.printf("%s %s", greetings[random.nextInt(greetings.length)], sentence);
                break;
            } else {
                System.out.println("Re-enter you credentials in valid format please ):");
            }
        }
    }
}
