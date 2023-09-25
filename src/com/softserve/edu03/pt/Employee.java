package com.softserve.edu03.pt;

import java.util.Scanner;

public class Employee {
    private static int totalSum;
    private String name;
    private int rate;
    private int hours;

    //Always add constructor without parameters

    public Employee() {
        this("N/A", 0, 0);
    }

    public Employee(String name) {
        this(name, 0, 0);
    }

    public Employee(String name, int rate) {
        this(name, rate, 0);
    }
    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += rate * hours;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum += (rate - this.rate) * this.hours;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum += (hours - this.hours) * this.rate;
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void promptValues (Employee employee) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = console.nextLine();
        System.out.println("Enter employee rate:");
        int rate = console.nextInt();
        System.out.println("Enter employee hours:");
        int hours = console.nextInt();
        employee.setName(name);
        employee.setRate(rate);
        employee.setHours(hours);
        //console.close();
    }
}
