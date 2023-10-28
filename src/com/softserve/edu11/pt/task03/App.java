package com.softserve.edu11.pt.task03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.printf("The name %s is %svalid%n", name, isValid(name) ? "" : "in");
        }
    }

    public static boolean isValid(String name) {
        return  name.matches("\\w{3,15}");
    }
}
