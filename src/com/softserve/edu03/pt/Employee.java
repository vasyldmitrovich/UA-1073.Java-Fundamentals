package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0;

    public Employee() {

    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();

    }

    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }

    public static double getTotalSum() {
        return totalSum;
    }
    public String toString() {
        return "Employee [name=" + name + ", rate=" + rate + ", hours" + hours + "]";

    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ruslan", 30, 40);
        Employee employee2 = new Employee("Migel", 25, 45);
        Employee employee3 = new Employee("Bob", 35, 30);

        System.out.println("Employee 1:" + employee1);
        System.out.println("Employee 2:" + employee2);
        System.out.println("Employee 3:" + employee3);

        System.out.println("Total Salary of All Employees: " + Employee.getTotalSum());
    }
}
