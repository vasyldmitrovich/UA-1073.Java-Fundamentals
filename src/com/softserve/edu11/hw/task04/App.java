package com.softserve.edu11.hw.task04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter first name and last name: ");
            String name = scanner.nextLine();
            if (name.matches("[a-zA-Z]+(-[a-zA-Z]+)*(\\s+[a-zA-Z]+(-[a-zA-Z]+)*)+")) {
                System.out.printf("Hello %s, welcome to Java!%n", name);
                break;
            } else {
                System.out.println("Entered data is invalid! Please enter it again.");
            }
        }
    }
}
