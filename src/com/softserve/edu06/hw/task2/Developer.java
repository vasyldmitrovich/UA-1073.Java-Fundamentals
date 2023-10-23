package com.softserve.edu06.hw.task2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: %.3f, Position: %s", getName(), getAge(), getSalary(), getPosition());
    }
}



