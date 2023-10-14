package com.softserve.edu07.hw.task1;

public class ContractEmployee extends Employee {
    private String federalTaxId; // Опис змінної federalTaxId

    public ContractEmployee(String employeeld, int payment, String federalTaxId) {
        super(employeeld, payment);
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    @Override
    public String getEmployeeld() {
        return employeeld;
    }

    public int getPayment() {
        return payment;
    }

    @Override
    public void calculatePay() {
        System.out.println("Payment: " + getPayment());
    }
}
