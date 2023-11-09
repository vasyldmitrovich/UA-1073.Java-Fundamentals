package com.softserve.edu03.hw.Task3;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main() {

        Person p1 = createPerson();
        p1.changeName("NewFirstName", "NewLastName");
        System.out.println("Updated information for p1:");
        System.out.println(p1.output());
        System.out.println("Age of " + p1.getFirstName() + " " + p1.getLastName() + ": " + p1.getAge());
        Person p2 = createPerson();
        System.out.println(p2.output());
        System.out.println("Age of " + p2.getFirstName() + " " + p2.getLastName() + ": " + p2.getAge());
        Person p3 = createPerson();
        System.out.println(p3.output());
        System.out.println("Age of " + p3.getFirstName() + " " + p3.getLastName() + ": " + p3.getAge());
        Person p4 = createPerson();
        System.out.println(p4.output());
        System.out.println("Age of " + p4.getFirstName() + " " + p4.getLastName() + ": " + p4.getAge());
        Person p5 = createPerson();
        System.out.println(p5.output());
        System.out.println("Age of " + p5.getFirstName() + " " + p5.getLastName() + ": " + p5.getAge());

    }

    public static Person createPerson() {
        System.out.println("Input First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Input Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Input birth year:");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        return new Person(firstName, lastName, birthYear);

    }
}