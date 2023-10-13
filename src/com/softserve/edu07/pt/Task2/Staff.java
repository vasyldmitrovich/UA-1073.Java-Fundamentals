package com.softserve.edu07.pt.Task2;

abstract class Staff extends Person {

    private double salary;

    @Override
    public void print() {}

    public Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    public void salary() {
        System.out.println("My salary is: " + salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

