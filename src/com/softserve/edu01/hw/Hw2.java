package com.softserve.edu01.hw;

import java.util.Scanner;

public class Hw2 {

    public static void nameAndAddress () {

        System.out.println("Hello, what is your name?");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Where do you live " + name);
        String address = new Scanner(System.in).nextLine();
        System.out.println("You are " + name
                + " and you are living in " + address);
    }
}
