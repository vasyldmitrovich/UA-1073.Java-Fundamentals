package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Input your Last Name:");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;

        String pattern = "^[A-Za-z\\s-]+$";
        Pattern namePattern = Pattern.compile(pattern);
        Matcher matcher = namePattern.matcher(fullName);

        if (matcher.matches()) {
            System.out.printf("Hello, %s, nice to meet you.", firstName);
        } else {
            System.out.println("Please, enter your Full Name using English letters, spaces, or hyphens.");
        }
    }
}



