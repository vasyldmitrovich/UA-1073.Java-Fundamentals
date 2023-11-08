package com.softserve.edu11.pt.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String firstName = scanner.nextLine();
    String lastName = scanner.nextLine();
    String middleName = scanner.nextLine();
        System.out.printf("%s %s. %s. %n",
                lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.printf("%s %s %s %n", firstName, middleName, lastName);
}
}
