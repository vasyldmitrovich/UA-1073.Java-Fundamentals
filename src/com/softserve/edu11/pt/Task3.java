package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task3 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter username");
            String username = SCANNER.nextLine();

            if (isValidUsername(username)) {
                System.out.println("Username is valid");
            } else {
                System.out.println("Username isn't valid");
            }
        }
    }
    public static boolean isValidUsername (String username) {
        return username.matches("\\w{3,15}");
    }
}
