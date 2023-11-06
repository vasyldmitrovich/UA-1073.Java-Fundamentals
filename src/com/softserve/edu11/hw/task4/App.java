package com.softserve.edu11.hw.task4;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Input you surename and name: ");
            String input = scanner.nextLine();

            if (input.matches("^[A-Za-z -]+$")) {
                String[] names = input.split(" ");
                firstName = names[0];
                lastName = names.length > 1 ? names[1] : "";

                validInput = true;
            } else {
                System.out.println("Bad format, try again");
            }
        }
        System.out.printf("Welcome %s %s ", firstName,lastName);
    }
}
