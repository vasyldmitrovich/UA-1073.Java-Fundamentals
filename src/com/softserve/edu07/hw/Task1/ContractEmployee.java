package com.softserve.edu07.hw.Task1;

import java.util.Scanner;

public class ContractEmployee extends Employee implements Payment{
   private String name;
    private String federalTaxIdmember;
    private int hourlyRate;
     private int numberOfHoursWorked;

    public ContractEmployee(String employeeld, String name, String federalTaxIdmember, int hourlyRate, int numberOfHoursWorked) {
        super(employeeld);
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return getHourlyRate()*getNumberOfHoursWorked();
    }

    @Override
    public String toString() {
        return "name = '" + getName() + '\'' +
                ", employee ID = '" + getEmployeeld() + '\'' +
                ", average monthly wage = " + calculatePay()
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
}
