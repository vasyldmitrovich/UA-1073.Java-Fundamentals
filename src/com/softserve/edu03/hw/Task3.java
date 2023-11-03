package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task3 {
    public static void task3(String... args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person("Alise", "Smithh");
        Person p2 = new Person("Max", "Levko");
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();


        while (true) {
            try {
                System.out.println("Enter a birth year of " + p1.getFirstName() + " " + p1.getLastName());
                p1.setBirthYear(sc.nextInt());
                System.out.println("Enter a birth year of " + p2.getFirstName() + " " + p2.getLastName());
                p2.setBirthYear(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                sc.nextLine();
            }
        }

        p3.input();
        p4.input();
        p5.input();

        p5.changeName("Fridrik");

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();

    }
}

//This class should be not in this file. Create file Person.java
