package com.softserve.edu07.pt;

public abstract class Staff extends Person {
    private double salary;

    public Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Staff(String name) {
        super(name);
        salary = 0;
    }

    public Staff() {
    }

    public abstract double salary();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
