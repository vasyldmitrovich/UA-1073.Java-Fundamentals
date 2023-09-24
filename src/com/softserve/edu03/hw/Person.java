package com.softserve.edu03.hw;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){
        this("N/A", "N/A");
    }

    public Person(String firstName, String lastName){
        this(firstName, lastName, Year.now().getValue());
    }

    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge(){
        Year currentYear = Year.now();
        int yearValue = currentYear.getValue();

        return yearValue - birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String output() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void input(){
        String newFirstName = readLine(String.format("Enter a new first name. (Current first name: %s).", firstName));
        String newLastName = readLine(String.format("Enter a new last name. (Current last name: %s)", lastName));

        changeName(newFirstName, newLastName);
    }

    private String readLine(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s To skip, press the Enter key: ", prompt);
        return scanner.nextLine();
    }

    public void changeName(String fn, String ln){
        if(!fn.isEmpty()){
            firstName = fn;
        }
        if(!ln.isEmpty()){
            lastName = ln;
        }
    }
}
