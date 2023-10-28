package com.softserve.edu11.pt.task02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        System.out.printf("%s %c. %c.%n", lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.printf("%s %s %s%n", firstName, middleName, lastName);
    }
}
