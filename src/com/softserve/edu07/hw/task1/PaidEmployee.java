package com.softserve.edu07.hw.task1;

public abstract class PaidEmployee extends Employee implements Payment, Comparable<PaidEmployee> {
    public PaidEmployee (String employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public int compareTo (PaidEmployee o1) {
        return (int) (o1.calculatePay() - calculatePay());
    }

    @Override
    public String toString () {
        return "{Employee ID: " + getEmployeeId() + "; Name: " + getName() + "; Average monthly wage: " + calculatePay() + '}';
    }
}
