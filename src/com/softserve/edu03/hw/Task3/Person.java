package com.softserve.edu03.hw.Task3;

import static com.softserve.edu03.hw.Task3.Main.SCANNER;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private static int thisYear = 2023;

    //constructors
    public Person() {
        this ("N/A" , "N/A");
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods
    public int getAge() {
        return thisYear - getBirthYear();
    }
    public static void input (Person person) {
        System.out.println("Please, input name");
        String firstName = SCANNER.nextLine();
        person.setFirstName(firstName);
        System.out.println("Input last name");
        String lastname = SCANNER.nextLine();
        person.setLastName(lastname);
        System.out.println("Input year of birth");
        int birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
        person.setBirthYear(birthYear);
    }
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
}
    public void output () {
        System.out.println("First name is " + getFirstName() + " ,last name is " + getLastName() + " ,age is " + getAge());
    }
    //getters and setters

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
