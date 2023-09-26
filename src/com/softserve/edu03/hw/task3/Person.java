package com.softserve.edu03.hw.task3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

//Конструкьри
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//Geters and Seters

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

//Метод вводу
    public void input () {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input First Name: ");
        this.firstName = scan.nextLine();

        System.out.print("Input Last Name:");
        this.lastName = scan.nextLine();

        System.out.print("Input year of birth: ");
        this.birthYear = scan.nextInt();
    }


//Метод виводу

    public void output () {
        System.out.println("First Name " + firstName);
        System.out.println("Last Name " + lastName);
        System.out.println("Year of Birth " + birthYear);
        System.out.println("Age " + getAge());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

}

