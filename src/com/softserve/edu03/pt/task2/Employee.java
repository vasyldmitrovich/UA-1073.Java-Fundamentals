package com.softserve.edu03.pt.task2;

public class Employee {

    private String name;
    private double rate;
    private int hours;
    static double totalSum = 0.0;

//Властивості доступу: Geters and Seters
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

//Конструктор за замовчуванням
    public Employee() {
    }

//конструктор з параметрами
    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary() + getBonus();
    }

//Метод обчислення зар.плати
    public double getSalary() {
        return rate * hours;
    }

//Метод обчислення бонусів
    public double getBonus() {
        return getSalary() * 0.1;
    }

    public double getAllSalary() {
        return getSalary() + getBonus();
    }



//Метод TO STRING
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
