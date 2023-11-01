package com.softserve.edu11.pt.task3;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a username for validation: ");
            String username = scanner.nextLine();
            System.out.println("The username '" + username + "' is " + (isNicknameValid(username) ? "" : "in") + "valid");
        }
    }

    public static boolean isNicknameValid(String username) {
        return username.matches("^[\\w]{3,15}$");
    }
}
