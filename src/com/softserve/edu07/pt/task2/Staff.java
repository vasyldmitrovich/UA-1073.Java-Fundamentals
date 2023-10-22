package com.softserve.edu07.pt.task2;

public abstract class Staff extends Person{
    private double salary;
    protected Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract String salary();
}