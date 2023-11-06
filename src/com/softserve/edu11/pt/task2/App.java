package com.softserve.edu11.pt.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String lastName = scanner.nextLine();
        String firstName = scanner.nextLine();
        String middleName = scanner.nextLine();

        System.out.printf("%s %s. %s. %n", lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.printf("%s %s %s", firstName, middleName, lastName);
    }
}
