package com.softserve.edu11.hw.Task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    static Scanner SCANNER = new Scanner(System.in);
    static String firstName;
    static String lastName;

    public static void input() {
        setFirstName();
        setLastName();
    }

    static public void setFirstName() {
        System.out.println("Input first name");
        String toCheck = SCANNER.nextLine();
        ;
        if (check(toCheck)) {
            firstName = toCheck;
        } else {
            System.out.println("Incorrect first name, try again");
            setFirstName();
        }
    }

    static public void setLastName() {
        System.out.println("Input last name");
        String toCheck = SCANNER.nextLine();
        ;
        if (check(toCheck)) {
            lastName = toCheck;
        } else {
            System.out.println("Incorrect last name, try again");
            setLastName();
        }
    }


    public static boolean check(String toCheck) {
        return toCheck.matches("(([a-zA-z]*)([\s]*)([-]*))*");
    }

    public static void print() {
        String[] strings = {
                "Hi",
                "Hello",
                "Hey there",
                "It’s good to see you",
                "It’s nice to meet you",
                "It’s a pleasure to meet you",
        };
        Random random = new Random();
        int hi = random.nextInt(0, strings.length);
        System.out.printf("%s, %s %s%n",
                strings[random.nextInt(0, strings.length)],
                firstName,
                lastName);
    }
}