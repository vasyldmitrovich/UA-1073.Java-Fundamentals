package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task4 {
    public void exec(){
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Task 4");

        System.out.println("How are you?");
        System.out.print("Answer: ");
        name = scanner.nextLine();

        System.out.printf("You are %s\n", name);

        System.out.println("\n\n");
    }
}
