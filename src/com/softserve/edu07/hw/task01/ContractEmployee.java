package com.softserve.edu07.hw.task01;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private double monthlyPayment;

    public ContractEmployee() {
        super();
        this.federalTaxIdMember = null;
        this.monthlyPayment = 0;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double monthlyPayment) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.monthlyPayment = monthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double calculatePay() {
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return "ID: " + getEmployeeId() + " Name: " + getName() + " FTIM: " +
                getFederalTaxIdMember() + " Monthly: " + calculatePay();
    }
}
