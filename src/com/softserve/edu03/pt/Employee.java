package com.softserve.edu03.pt;

public class Employee {
    public static String totalSalary;//Why you do not use this field?
    private static double totalSum;

    private String name;
    private double rate;
    private double hours;

    public Employee() {}

    public Employee(String name) {
        this(name, 0, 0);
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum += getSalary();
    }

    public double getBonuses(){
        return getSalary() * 0.1;
    }

    private void recalculateTotalSum(double newRate, double newHours){
        totalSum += newRate * newHours - getSalary();
    }

    public double getSalary(){
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static double getTotalSum(){
        return totalSum;
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
        recalculateTotalSum(rate, hours);
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        recalculateTotalSum(rate, hours);
        this.hours = hours;
    }
}

