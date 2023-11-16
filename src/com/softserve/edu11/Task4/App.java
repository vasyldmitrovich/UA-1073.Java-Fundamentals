package com.softserve.edu11.Task4;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String nameRegex = "^[a-zA-Z\\s-]+$";

        String[] greetingPhrases = {
                "Hello, %s! Welcome!",
                "Hi %s! Nice to see you!",
                "Greetings, %s! How can I assist you today?"
        };

        String firstName = validateName("Enter your first name: ", nameRegex, scanner);
        String lastName = validateName("Enter your last name: ", nameRegex, scanner);

        String randomGreeting = greetingPhrases[random.nextInt(greetingPhrases.length)];
        String formattedGreeting = String.format(randomGreeting, firstName);

        System.out.println(formattedGreeting);

        scanner.close();
    }

    private static String validateName(String prompt, String regex, Scanner scanner) {
        String input;
        boolean isValid;
        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            isValid = input.matches(regex);
            if (!isValid) {
                System.out.println("Invalid input. Please use only English letters, spaces, and hyphens.");
            }
        } while (!isValid);

        return input;
    }
}

