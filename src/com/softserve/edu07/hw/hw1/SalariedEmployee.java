package com.softserve.edu07.hw.hw1;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;
    private int averageMonthlySalary;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, int averageMonthlySalary) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public int calculatePay() {
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "SSNumber: " + getSocialSecurityNumber() + ",  " + getEmployeeld() +
                ", have average monthly  wage - " + calculatePay() + " $";
    }
}
