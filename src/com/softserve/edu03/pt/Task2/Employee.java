package com.softserve.edu03.pt.Task2;

public class Employee {//This class is good
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0;

    public Employee() {
        this.name = "";
        this.rate = 0.0;
        this.hours = 0.0;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.10 * getSalary();
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + "\nSalary: $" + getSalary() + "\nBonuses: $" + getBonuses() + "\n";
    }
}
