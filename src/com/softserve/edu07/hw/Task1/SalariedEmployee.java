package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee implements Payment{
    private String name;
    private String socialSecurityNumber;
    private int fixedMonthlyPayment;
    @Override
    public int calculatePay() {
        return getFixedMonthlyPayment();
    }

    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(employeeld);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return  "name = '" + getName() + '\'' +
                ", employee ID = '" + getEmployeeld() + '\'' +
                ", average monthly wage = " + calculatePay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
}
