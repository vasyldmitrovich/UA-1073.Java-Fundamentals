package com.softserve.edu03.hw.Task3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int lifeDay;
    private int lifeMonth;
    private int liveYear;
    private int d;//What it is???? what the name of fields, give more informative name of fields
    private int m;
    private int y;


    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.lifeDay = 0;
        this.lifeMonth = 0;
        this.liveYear = 0;
        this.d = 0;
        this.m = 0;
        this.y = 2023;
    }

    public Person(String firstName, String lastName, int lifeDay, int lifeMonth, int liveYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lifeDay = lifeDay;
        this.lifeMonth = lifeMonth;
        this.liveYear = liveYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getLifeDay() {
        return lifeDay;
    }

    public int getLifeMonth() {
        return lifeMonth;
    }

    public int getLiveYear() {
        return liveYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Input Second Name: ");
        lastName = scanner.nextLine();
        //Вводити потрібно день місяця вякому народилася людина наприклад "10"
        System.out.print("Input Birth Day: ");
        lifeDay = scanner.nextInt();
        //Вводити потрібно номер місяця вякому народилася людина наприклад від 1 до 12
        System.out.print("Input Birth Month: ");
        lifeMonth = scanner.nextInt();
        //Вводити потрібно рік народження
        System.out.print("Input Birth Year: ");
        liveYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("-------------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Second Name: " + lastName);
        System.out.println("Life Day: " + lifeDay);
        System.out.println("life Month: " + lifeMonth);
        System.out.println("live Year: " + liveYear);
        System.out.println("Age: "+ getAge());
    }

    public int getAge() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - liveYear;
    }

    //адекватної реалізації для цього методу я не зміг придумати, можливо ви могли б щось запропонувати
    //All is good, this method is good it change first name and last name, all ok
    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
}
