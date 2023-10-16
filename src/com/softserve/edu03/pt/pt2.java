package com.softserve.edu03.pt;

public class pt2 {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0.0;

    public pt2(String name, double rate, double hours) {
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

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }

    @Override
    public String toString() {
        return "Employee [Name: " + name + ", Rate: " + rate + ", Hours: " + hours + "]";
    }

    public static void main(String[] args) {
        pt2 employee1 = new pt2("John", 15.0, 40.0);
        pt2 employee2 = new pt2("Alice", 20.0, 35.0);
        pt2 employee3 = new pt2("Bob", 18.0, 42.5);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total Salary of All Employees: $" + pt2.getTotalSum());
    }
}

