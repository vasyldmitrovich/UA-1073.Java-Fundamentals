package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee implements Payment {

    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String position, String employeeId, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(name, position, employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculate() {
        return fixedMonthlyPayment;
    }

    @Override
    public void promptEmployee() {
        super.promptEmployee();
        System.out.println("The Fixed monthly salary this employee is: " + calculate() + ".");
        System.out.println("The Social security number: " + socialSecurityNumber + ".");
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
