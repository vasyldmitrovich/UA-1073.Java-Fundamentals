package com.softserve.edu05.pt.task4;

public class Employee {
    private String PIB;
    private int numberVid;
    private double salary;

    public Employee(String PIB, int numberVid, double salary) {
        this.PIB = PIB;
        this.numberVid = numberVid;
        this.salary = salary;
    }

    public String getPIB() {
        return PIB;
    }

    public int getNumberVid() {
        return numberVid;
    }

    public double getSalary() {
        return salary;
    }
}
