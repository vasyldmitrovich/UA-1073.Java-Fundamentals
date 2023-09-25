package com.softserve.edu03.hw;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter a last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter a birthday year: ");
        birthYear = scanner.nextInt();

        scanner.nextLine();
    }

    // Do not correct order. Firstly should be fields after constructors without and with parameters after method like toString() and after another methods

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - birthYear;

    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public void changeName(String fn) {
        this.firstName = fn;
    }

    public void output() {
        System.out.println("First and last name: " + firstName + " " + lastName + ", BirthYear: " + birthYear);
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
