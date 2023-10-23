package com.softserve.edu06.hw;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Ім'я: Тарас, Вік: 32 роки, Зарплата:32735.35", name, age, salary);
    }
}

class main {
    public static void main(String[] args) {
        Employee employee = new Employee("Тарас", 32, 32735.35);
        Developer developer = new Developer("Тарас", 32, 32735.35, "Middle Java-розробник");

        System.out.println("Інформація про Employee:");
        System.out.println(employee.report());

        System.out.println("\nІнформація про Developer:");
        System.out.println(developer.report());
    }
}