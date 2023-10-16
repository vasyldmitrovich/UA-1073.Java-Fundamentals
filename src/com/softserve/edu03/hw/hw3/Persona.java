package com.softserve.edu03.hw.hw3;
//done
import java.time.LocalDate;
import java.util.Scanner;

public class Persona {
    private String firstName;
    private String lastName;
    private static int birthYear;

    public Persona() {
        this("N/A","N/A",0);
    }


    public Persona(String firstname, String lastName, int birthYear) {
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

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter Birth year: ");
        birthYear = scanner.nextInt();
    }
    public static int getAge(){
        return LocalDate.now().getYear() - birthYear;
    }

    public void output(){
        System.out.println(firstName + " " + lastName + " " + "is " + getAge() + " years old"); //Should be like that

    }


    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }

}
