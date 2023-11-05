package com.softserve.edu03.hw.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {//This is good structure of class, nice
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    private int getAge() {
        return  2023 - birthYear;
    }
    public void input() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first name: ");
            firstName = scanner.nextLine();


            System.out.print("Enter last name: ");
            lastName = scanner.nextLine();


            System.out.print("Enter birth year: ");
            birthYear = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter values of type string!");
        }


    }

    public void output() {
        System.out.println("==================");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn == null || fn.isEmpty()) {
            lastName = ln;
        } else if (ln == null || ln.isEmpty()) {
            firstName = fn;
        } else {
            firstName = fn;
            lastName = ln;
        }
    }
}
