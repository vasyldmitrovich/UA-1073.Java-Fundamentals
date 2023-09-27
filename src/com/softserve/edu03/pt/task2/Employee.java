package com.softserve.edu03.pt.task2;

public class Employee {
    private String name;
    private double rate;
    private final double hours;

    private static double totalSum = 0;

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }


    // Methods
    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.10 * getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                '}';
    }
}
