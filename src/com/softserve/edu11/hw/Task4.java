package com.softserve.edu11.hw;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String[] GREETINGS = {
            "Hello, %s! Have a great day.",
            "Hi there, %s! Hope you're doing well.",
            "Greetings, %s!",
            "Hey, %s!"
    };

    public static void main (String[] args) {
        var firstName = promptString("Enter first name");
        var lastName = promptString("Enter last name");

        greet(firstName, lastName);
    }

    public static String promptString (String message) {
        String str;

        while (true) {
            System.out.println(message);
            str = SCANNER.nextLine();
            if (!validateString(str)) {
                System.out.println("String is invalid.");
                continue;
            }

            break;
        }

        return str;
    }

    public static boolean validateString (String str) {
        return str.matches("^[A-Za-z -]+$");
    }

    public static String getFulLName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void greet (String firstName, String lastName) {
        var fullName = getFulLName(firstName, lastName);

        var in = new Random().nextInt(0, GREETINGS.length - 1);

        System.out.printf(GREETINGS[in], fullName);
    }
}
