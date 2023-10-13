package com.softserve.edu03.hw;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Person p1 = new Person("Mark ", "Edison ", 2000);
        Person p2 = new Person("Bob ", "Piterson ", 1995);
        Person p3 = new Person("Erik ", "Bobkin ", 1998);
        Person p4 = new Person("Anna ", "Tarasovska ", 2005);
        Person p5 = new Person("Maks ", "Tupkin ", 2003);
        System.out.println("Person information: ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        Person person = new Person(" Nik ", " Nikov ",  1995 );
        person.personInput();
        person.personOutput();
        person.changeName(" Mike "," Simonov ");
        person.personOutput();
    }

    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear;

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
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    public void personInput() {
        System.out.println("Input person firstName: ");
        firstName = scanner.nextLine();
        System.out.println("Input person lastName: ");
        lastName = scanner.nextLine();
        //scanner.nextInt();
        System.out.println("Input person birthYear");
        birthYear = scanner.nextInt();

    }

    public void personOutput() {
        System.out.println("Name: " + firstName);
        System.out.println("lastName" + lastName);
        System.out.println("birthYear" + birthYear);
        System.out.println("Age: " + getAge() + " years");
    }

    public void changeName(String newFirstName, String newLastName) {
        if (newFirstName != null) {
            this.firstName = newFirstName;
        }

        if (newLastName != null) {
            this.lastName = newLastName;
        }
    }

    @Override
    public String toString() {
        return "Name: " + firstName + "Last Name: " + lastName + "Birth Year: " + birthYear + " Age: " + getAge() + " years";
    }


}

