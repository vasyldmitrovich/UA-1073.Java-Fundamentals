package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < 5; i++);
        System.out.format("The name '%s' is %svalid%n",
                name, isValid(name) ? "" : "in");
    }
    public static boolean isValid(String name) {
        return name.matches("[\\w{3,15]");
    }
}
