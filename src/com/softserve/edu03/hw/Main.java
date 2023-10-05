package com.softserve.edu03.hw;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        this.firstName = scanner.nextLine();

        System.out.print("Введіть прізвище: ");
        this.lastName = scanner.nextLine();

        System.out.print("Введіть рік народження: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("ім'я: " + firstName);
        System.out.println("прізвище: " + lastName);
        System.out.println("рік народження: " + birthYear);
        System.out.println("вік: " + getAge() + " років");
    }

    public void changeName(String fn, String ln) {
        if (fn != null) {
            this.firstName = fn;
        }

        if (ln != null) {
            this.lastName = ln;
        }
    }
}

       public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Введіть інформацію про людину " + (i + 1) + ":");
            people[i] = new Person();
            people[i].input();
        }

        System.out.println("\nІнформація про людину:");

        for (Person person : people) {
            person.output();
            System.out.println();
        }

        System.out.println("Зміна ім'я для першої людини 'Ігор' та прізвище на 'Коваленко'");
        people[0].changeName("Ігор", "Коваленко");

        System.out.println("\n" +
                "\u041E\u043D\u043E\u0432\u043B\u0435\u043D\u0430 \u0456\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0456\u044F \u043F\u0440\u043E \u043B\u044E\u0434\u0438\u043D\u0443:");
        people[0].output();

        scanner.close();
    }
}