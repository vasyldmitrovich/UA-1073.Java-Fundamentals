package com.softserve.edu03.hw;

import java.util.Calendar;
import java.util.Scanner;

public class Task3 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person("Alise", "Smithh");
        Person p2 = new Person("Max", "Levko");
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        System.out.println("Enter a birth year of " + p1.getFirstName() + " " + p1.getLastName());
        p1.setBirthYear(sc.nextInt());
        System.out.println("Enter a birth year of " + p2.getFirstName() + " " + p2.getLastName());
        p1.setBirthYear(sc.nextInt());

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

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public Person() {
    }

    public int getAge() {
        //Date date = new Date();
        //date.getYear();
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - birthYear;

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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