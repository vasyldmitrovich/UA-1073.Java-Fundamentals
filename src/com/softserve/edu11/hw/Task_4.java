package com.softserve.edu11.hw;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your last name and first name");
        String firstLastName = scanner.nextLine();

        while (!isValid(firstLastName)) {
            System.out.println("Incorrectly. Try again: ");
            firstLastName = scanner.nextLine();
        }
        greetRandom(firstLastName);
    }
    static String[] greeting = new String[]{
            "Good day",
            "Good night",
            "Hello",
            "Good morning",
            "Hi"
    };

    static boolean isValid(String name) {
        return name.matches("^[A-Z][a-z-]+ [A-Z][a-z-]+");
    }

    static void greetRandom(String name) {
        Random random = new Random();
        String greet = greeting[random.nextInt(0, greeting.length)];
        System.out.printf("%s,%s", greet, name);
    }
}
