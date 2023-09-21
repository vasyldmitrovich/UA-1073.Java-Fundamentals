package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = console.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = console.nextLine();
        System.out.println("Your name is " + name + ". Your address is " + address);
    }
}
