package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public void execute()
    {
        var scanner = new Scanner(System.in);
        var myList = new SmallestInt();
        System.out.println("Input first number: ");
        myList.addNumber(scanner.nextInt());

        System.out.println("Input second number: ");
        myList.addNumber(scanner.nextInt());

        System.out.println("Input third number: ");
        myList.addNumber(scanner.nextInt());

        System.out.println("Smallest Int: " + myList.findTheSmallestInt());
    }
}
