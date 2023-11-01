package com.softserve.edu11.pt.task2;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = getUser();

        //Last name and initials
        System.out.printf("%s %s. %s.%n", user.getLastName(), user.getFirstName().charAt(0), user.getMiddleName().charAt(0));

        //First name
        System.out.printf("%s%n", user.getFirstName());

        //First name, middle name, and last name
        System.out.printf("%s %s %s%n", user.getFirstName(), user.getMiddleName(), user.getLastName());
    }

    public static User getUser() {

        System.out.print("Enter a last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter a first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter a middle name: ");
        String middleName = scanner.nextLine();

        return new User(lastName, firstName, middleName);
    }
}
