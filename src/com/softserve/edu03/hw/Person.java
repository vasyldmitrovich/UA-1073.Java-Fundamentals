package com.softserve.edu03.hw;

import java.util.Date;

import static com.softserve.edu03.hw.App.SCANNER;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person () {
        this("Unknown", "Unknown", 0);
    }

    public Person (String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    /**
     * Calculates and returns the age of the person based on the current year and
     * their birth year.
     *
     * @return The age of the person as an integer.
     */
    public int getAge() {
        Date today = new Date();
        int year = today.getYear();
        return year - birthYear;
    }

    /**
     * Prompts the user to input the first name, last name, and birth year of a
     * person and sets these values in the provided Person object.
     *
     * @param person The Person object to store the input values.
     */
    public static void input(Person person) {
        System.out.println("Input first name: ");
        String firstName = SCANNER.nextLine();
        person.setFirstName(firstName);

        System.out.println("Input last name: ");
        String lastName = SCANNER.nextLine();
        person.setLastName(lastName);

        System.out.println("Input birth year: ");
        int birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
        person.setBirthYear(birthYear);
    }

    /**
     * Displays the first name, last name, and birth year of a person.
     *
     * @param person The Person object to display information for.
     */
    public static void output(Person person) {
        System.out.println("Person first name is " + person.getFirstName());
        System.out.println("Person last name is " + person.getLastName());
        System.out.println("Person age is " + person.getAge());
    }

    /**
     * Changes the first name and last name of the person.
     *
     * @param fn The new first name for the person.
     * @param ln The new last name for the person.
     */
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    /**
     * Changes the first name of the person.
     *
     * @param fn The new first name for the person.
     */
    public void changeName(String fn) {
        this.firstName = fn;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear () {
        return birthYear;
    }

    public void setBirthYear (int birthYear) {
        this.birthYear = birthYear;
    }
}
