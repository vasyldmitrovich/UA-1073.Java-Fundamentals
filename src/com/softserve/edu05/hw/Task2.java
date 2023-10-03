package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task2 {
    public static void run() {
        Scanner console = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Enter 2 numbers");
            int a = console.nextInt();
            console.nextLine();
            int b = console.nextInt();
            console.nextLine();
            System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
            System.out.println("Type 'yes' if You want to repeat");
            answer = console.nextLine();
        } while (answer.toLowerCase().equals("yes"));
    }
}
