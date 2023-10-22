package com.softserve.edu07.hw.Task1;

public class ContactEmployee extends Employee implements Payment {//Without implements Payment, because parent class already implement this interphase

    private int hoursOfWork;
    private double hourlyRate;

    private  String federalTaxId;

    public ContactEmployee(String name, String position, String employeeId, int hoursOfWork, double hourlyRate, String federalTaxId) {
        super(name, position, employeeId);
        this.hoursOfWork = hoursOfWork;
        this.hourlyRate = hourlyRate;
        this.federalTaxId = federalTaxId;
    }

    @Override
    public double calculate() {
        double averageMonthlySalary = hourlyRate * hoursOfWork;
        return averageMonthlySalary;
    }

    @Override
    public void promptEmployee() {
        super.promptEmployee();
        System.out.println("The Average monthly salary this employee is: " + calculate() + ".");
        System.out.println("The Federal Tax ID: " + federalTaxId + ".");
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }
}