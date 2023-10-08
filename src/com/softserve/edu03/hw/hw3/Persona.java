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
        String firstName = scanner.nextLine();
        System.out.println("Enter First Name: ");
        String lasttName = scanner.nextLine();
        System.out.println("Enter First Name: ");
        int birthYear = scanner.nextInt();
    }
    public static int getAge(){
        return LocalDate.now().getYear() - birthYear;
    }

    public void output(){
       // System.out.println(firstName() + " " + lastName + " " + "is" + getAge() + "years old"); //idea каже що не може знайти цей метод при рані програми (
        // Method call expected), коли роблю як idea реколендує також є помилка після вводу фамілії. Підкажіть як пофіксити?
    }

    //private String firstName() { //idea попросила його створити, не розумію чому. Чи можете ви мені пояснити?
       // return null;
    //}

    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }

}
