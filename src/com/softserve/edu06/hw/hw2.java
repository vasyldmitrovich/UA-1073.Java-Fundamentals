package com.softserve.edu06.hw;

class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String report() {
        return "Name: " + name + ", Age: " + age + " years, Position: " + position + ", Salary: " + salary;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, String position, double salary, String programmingLanguage) {
        super(name, age, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String report() {
        return super.report() + ", Programming Language: " + programmingLanguage;
    }
}

public class hw2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "Software Engineer", 50000.0);
        Developer developer = new Developer("Taras", 32, "Average Java Developer", 32735.35, "Java");

        System.out.println("Employee Information:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information:");
        System.out.println(developer.report());
    }
}

