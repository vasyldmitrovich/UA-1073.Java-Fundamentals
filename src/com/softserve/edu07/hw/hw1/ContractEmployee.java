package com.softserve.edu07.hw.hw1;

public class ContractEmployee extends Employee implements Payment {//Implement this interphase in class Employee not here

    private String federalTaxIdMember;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public ContractEmployee(String employeeld, String federalTaxIdMember, int hourlyRate, int numberOfHoursWorked) {
        super(employeeld);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return getHourlyRate()*numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "FederalId: " + getFederalTaxIdMember() + ",  " + getEmployeeld() +
                ", have average monthly  wage - " + calculatePay() + " $";
    }
}
