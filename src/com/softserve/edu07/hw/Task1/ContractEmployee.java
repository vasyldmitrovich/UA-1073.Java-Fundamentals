package com.softserve.edu07.hw.Task1;

public class ContractEmployee extends PaidEmployee {
    private String federalTaxIdMember;
    private double monthlyPay;

    public ContractEmployee(String name, String employeeId, String federalTaxIdMember, double monthlyPay) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.monthlyPay = monthlyPay;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return monthlyPay;
    }
}

