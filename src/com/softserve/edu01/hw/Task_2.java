package com.softserve.edu01.hw;

import java.io.IOException;
import java.util.Scanner;

public class Task_2 {
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name);
        String address = scanner.nextLine();
        System.out.println(name + " lives in " + address);
    }
}
