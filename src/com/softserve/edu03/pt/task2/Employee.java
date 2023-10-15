package com.softserve.edu03.pt.task2;

public abstract class Employee {
    private final String name;
    private final double rate;
    private final double hours;

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
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

    public abstract String report();

    protected Object getName() {
        return null;
    }
}
