package com.softserve.edu03.hw;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this("N/A", "N/A", 0);
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
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

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input() {
        Scanner console = new Scanner(System.in);
        System.out.println("Input first name:");
        setFirstName(console.nextLine());
        System.out.println("Input last name:");
        setLastName(console.nextLine());
        System.out.println("Input birth year:");
        setBirthYear(console.nextInt());
    }

    public void output() {
        System.out.println(getFirstName() + " " + getLastName() + " birth in " + getBirthYear() + ", " + getAge() + " years old.");
    }

    public void changeName (String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }
}
