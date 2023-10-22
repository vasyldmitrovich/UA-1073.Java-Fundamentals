package com.softserve.edu07.hw;

public class ContractEmployee extends Employee implements Payment {//This interfaces should implement Employee
    private String federalTaxIdMember;
    private int hourlyRate;

    public ContractEmployee(String employeeId, String name, double salary, String federalTaxIdMember, int hourlyRate) {
        super(employeeId, name, salary);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        setSalary(calculatePay());
    }

    @Override
    public double calculatePay() {
        return getSalary() * hourlyRate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString() +
                "hourlyRate=" + hourlyRate + ", "+
                "federalTaxIdMember=" + federalTaxIdMember + "}";
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
