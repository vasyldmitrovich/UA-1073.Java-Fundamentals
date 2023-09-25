package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task2 {

    //The same with name of this method
    public static void main(String... args) {
        Employee employee1 = new Employee("Alex", 7, 49);
        Employee employee2 = new Employee("Sofia", 9);
        Employee employee3 = new Employee();

        Employee.initializeEmployee(employee3);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Salary of '" + employee1.getName() + "' is " + employee1.getSalary());
        System.out.println("Salary of '" + employee2.getName() + "' is " + employee2.getSalary());
        System.out.println("Salary of '" + employee3.getName() + "' is " + employee3.getSalary());

        System.out.println("Bonus to the salary of '" + employee1.getName() + "' is " + employee1.getBonuses());
        System.out.println("Bonus to the salary of '" + employee2.getName() + "' is " + employee2.getBonuses());
        System.out.println("Bonus to the salary of '" + employee3.getName() + "' is " + employee3.getBonuses());

        System.out.println("Total salary: " + Employee.getTotalSum());

    }
}

//The same mistake with this class, move this class to file Employee.java
class Employee {

    //Move this method at the end of class
    //Remember about order of fields and methods in class
    public static void initializeEmployee(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        employee.name = scanner.nextLine();
        System.out.print("Enter the employee's rate: ");
        employee.rate = scanner.nextInt();
        System.out.print("Enter the employee's hours: ");
        employee.hours = scanner.nextDouble();
        totalSum += employee.getSalary();
    }
    private static double totalSum = 0;

    private String name;
    private int rate;
    private double hours;

    public static double getTotalSum() {
        return totalSum;
    }


    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public double getSalary() {
        return rate * hours;
    }

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, double hours) {
        totalSum -= getSalary();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -= getSalary();
        this.hours = hours;
        totalSum += getSalary();
    }
}
