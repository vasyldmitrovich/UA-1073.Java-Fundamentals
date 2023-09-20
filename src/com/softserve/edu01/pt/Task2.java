package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    public void readPersonInfo(){
        Scanner scanner = new Scanner(System.in);
        String name;
        String address;

        System.out.println("Task #2");

        System.out.println("What is your name?");
        System.out.print("Answer: ");
        name = scanner.nextLine();

        System.out.printf("Where do you live, %s?\n", name);
        System.out.print("Answer: ");
        address = scanner.nextLine();

        System.out.println("\nFull information:");
        System.out.printf("Your name is: %s\n", name);
        System.out.printf("Your address: %s\n", address);

        System.out.println("\n\n");
    }
}
