package com.softserve.edu01.hw;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name);
        String place = scanner.nextLine();
        System.out.println("Hi, " + name + ", you live in " + place);

    }
}