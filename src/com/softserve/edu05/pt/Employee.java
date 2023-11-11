package com.softserve.edu05.pt;

    public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Створення п'яти об'єктів класу Employee за допомогою конструктора.
        Employee employee1 = new Employee("Marta", 2301, 55000.0);
        Employee employee2 = new Employee("Julia", 3212, 69000.0);
        Employee employee3 = new Employee("Ostap", 1036, 53000.0);
        Employee employee4 = new Employee("Diana", 6544, 70000.0);
        Employee employee5 = new Employee("Roman", 1058, 48000.0);

        // Виведення інформації про створених працівників.
        System.out.println("Employee 1: " + employee1.toString());
        System.out.println("Employee 2: " + employee2.toString());
        System.out.println("Employee 3: " + employee3.toString());
        System.out.println("Employee 4: " + employee4.toString());
        System.out.println("Employee 5: " + employee5.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}

