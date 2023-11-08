package com.softserve.edu11.pt.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            if (isVallid(name)) {
                System.out.println("The name '" + name + "' is valid");
            } else {
                System.out.println("The name '" + name + "' isn`t valid");
            }
        }
    }

    public static boolean isVallid(String name) {
        return name.matches("\\w {3,15}");
    }
}

