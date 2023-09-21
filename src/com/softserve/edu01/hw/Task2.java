package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "." + " Right now, I know you live in " + address + ".");
    }
}
