package com.softserve.edu07.task1;

public class ContractEmployee extends Employee {
    private String federalTaxIdmember;

    private double fixedMonthPayment;
    public ContractEmployee(String employeeId, String federalTaxIdmember, double fixedMonthPayment) {
        super(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthPayment = fixedMonthPayment;
    }


    @Override
    public double calculatePay() {
        return fixedMonthPayment;
    }

}
