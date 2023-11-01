package com.softserve.edu11.hw.task4;

import java.util.Random;
import java.util.Scanner;

public class App {
    static String[] greetings = new String[]{
            "Hello",
            "Welcome",
            "Good afternoon",
            "Hi",
            "Good evening",
            "Good morning",
    };

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Enter a first name and last name: ");
        String firstAndLastName = scanner.nextLine();
        while (!isValid(firstAndLastName)) {
            System.out.print("Wrong first and last name! Enter a first name and last name again:");
            firstAndLastName = scanner.nextLine();
        }
        greet(firstAndLastName);

    }

    public static boolean isValid(String names) {
        return names.matches("^[A-Z][a-z-]+ [A-Z][a-z-]+");
    }

    public static void greet(String name) {
        Random random = new Random();
        String greet = greetings[random.nextInt(0, greetings.length)];
        System.out.printf("%s, %s!", greet, name);
    }
}
