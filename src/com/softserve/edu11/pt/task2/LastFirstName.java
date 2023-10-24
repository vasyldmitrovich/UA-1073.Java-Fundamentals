package com.softserve.edu11.pt.task2;

import java.util.Scanner;

public class LastFirstName {
    public static void task2() {

        var scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String firstName = scan.nextLine().toUpperCase();

        System.out.println("Enter your last name: ");
        String lasttName = scan.nextLine().toUpperCase();

        System.out.println("Enter your middle name: ");
        String middletName = scan.nextLine().toUpperCase();
        System.out.println("");

        System.out.printf("%s %s.%s.\n",
                lasttName, firstName.charAt(0), middletName.charAt(0));

        System.out.printf("%s\n",
                firstName);

        System.out.printf("%s %s %s",
                firstName, middletName, lasttName);
    }
}
//Input the last name, first name, and middle name as String variables on the console. The
//following outputs will be displayed on the console:
//• Last name and initials
//• First name
//• First name, middle name, and last name.