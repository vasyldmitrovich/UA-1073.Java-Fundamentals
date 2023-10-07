package com.softserve.edu06.hw.task2;

public class Developer extends Employee {
    private String position;

    public Developer (String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public Developer (Employee employee, String position) {
        super(employee.getName(), employee.getAge(), employee.getSalary());
        this.position = position;
    }

    @Override
    public String report () {
        return String.format("Name: %s, Age: %d years, Position: " + position + ", Salary: %.2f.",
                getName(),
                getAge(),
                getSalary());
    }

    public String getPosition () {
        return position;
    }

    public void setPosition (String position) {
        this.position = position;
    }
}
