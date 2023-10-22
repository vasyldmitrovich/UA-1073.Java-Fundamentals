package com.softserve.edu03.pt;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {//Move to App.java
        Employee ob1 = new Employee("Mark", 15,40);
        Employee ob2 = new Employee("Bob", 25,60);
        Employee ob3 = new Employee("Mark", 15,26);

        double totalSalary = ob1.getSalary() + ob2.getSalary() + ob3.getSalary();
        Employee.updateTotalSum(totalSalary);
        System.out.println("Employee information: ");
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
        System.out.println("Total Salary of All Employees: " + Employee.getTotalSum());
    }

    private String name;
    private double rate;
    private double hours;
    static private double totalSum = 0.0;


    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
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
        return 0.10 * getSalary();
    }

    public String toString() {
        return "Name: " + name + " Rate: " + rate + " Hours: " + hours + " Salary: " + getSalary() + " Bonuses: " + getBonuses();
    }

    public static void updateTotalSum(double salary){
        totalSum += salary;
    }

    public static double getTotalSum(){
        return totalSum;
    }

}

