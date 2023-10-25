package com.softserve.edu06.hw;

public class Employee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Taras", 26, 37000),
                new Employee("Mark", 48, 90000)
        };
        Developer[] developers = {
                new Developer("Ruslan", 23, 80000),
                new Developer("Artem", 22, 75000)
        };

        for (var employee : employees) {
            employee.report();
        }
        for (var employee : employees) {
            System.out.println(employee);
        }

        for (var developer : developers) {
            developer.report();
        }
        for (var developer : developers) {
            System.out.println(developer);
        }
    }

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," + "Salary: \u20B4 %.2f.", name, age, salary);
    }

    @Override
    public String toString() {
        return "Employee " + "Name: " + getName() + " Age: " + getAge() + " Salary: " + getSalary() + "\u20B4";
    }
}

class Developer extends Employee {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String toString() {
        return "Developer " + "Name: " + getName()
                + " Age: " + getAge() + " Salary: " + getSalary();
    }

    public String report() {
        return "Name: " + getName()
                + " Age: " + getAge() + " Salary: " + getSalary();
    }
}
