package com.softserve.edu11.pt;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ptall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Verify if the first variable is a substring of the second variable
        System.out.println("Task 1:");
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        boolean isSubstring = str2.contains(str1);
        System.out.println("Is the first string a substring of the second string? " + isSubstring);

        // Task 2: Output last name and initials, first name, and first name, middle name, and last name
        System.out.println("\nTask 2:");
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        // Output last name and initials
        System.out.println("Last name and initials: " + lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".");

        // Output first name
        System.out.println("First name: " + firstName);

        // Output first name, middle name, and last name
        System.out.println("First name, middle name, and last name: " + firstName + " " + middleName + " " + lastName);

        // Task 3: Validate usernames using regular expressions
        System.out.println("\nTask 3: Validate Usernames");
        String[] usernames = {"user123", "john_doe", "alice.smith", "user_with_long_name", "user!"};

        for (String username : usernames) {
            boolean isValid = validateUsername(username);
            System.out.println("Is username '" + username + "' valid? " + isValid);
        }
    }

    private static boolean validateUsername(String username) {
        // Username should be between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores.
        String regex = "^[a-zA-Z0-9_]{3,15}$";
        return Pattern.matches(regex, username);
    }
}

