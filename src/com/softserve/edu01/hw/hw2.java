package com.softserve.edu01.hw;

import java.util.*;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = scanner.nextLine();
        System.out.println("Thanks for information, your address is: " + address + " is it correct?");
        System.out.println("Either press y for yes & n for no");
        String agree = scanner.nextLine();
        switch (agree) {
            case ("y"):
                System.out.println("Ok, thank you");
                break;
            case ("n"):
                System.out.println("Ohh");
                break;
            default:
                System.out.println("Something went wrong");
        }
        scanner.close();
    }
}
