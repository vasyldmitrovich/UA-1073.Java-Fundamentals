package com.softserve.edu11.pt.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            var name = scanner.nextLine();
            if (isValid(name)) {
                System.out.println("The name '" + name + "' is valid");
            } else {
                System.out.println("The name ' " + name + "' is invalid");

            }
        }
    }


    public static boolean isValid(String name) {
        return name.matches("[\\w{3,15}]");
    }
}
// не зовсім правильно, у чому справа?