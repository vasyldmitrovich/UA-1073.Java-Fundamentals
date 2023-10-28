package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Enter first name");
        String firstName = SCANNER.nextLine();

        System.out.println("Enter middle name");
        String middleName = SCANNER.nextLine();

        System.out.println("Enter last name");
        String lastName = SCANNER.nextLine();

        System.out.printf("%s %s. %s.%n", lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.printf("%s %s %s%n", firstName, middleName, lastName);
    }

}
