package com.softserve.edu07.hw;

interface Payment {
    double calculatePay();
}

abstract class Employee {
    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
}

class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}

class ContractEmployee extends Employee implements Payment {
    private String federalTaxId;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class hw1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("S001", "SSN123", 5000.0);
        employees[1] = new ContractEmployee("C001", "FTI456", 20.0, 160);
        employees[2] = new SalariedEmployee("S002", "SSN456", 6000.0);

        java.util.Arrays.sort(employees, (e1, e2) -> {
            double wage1 = (e1 instanceof Payment) ? ((Payment) e1).calculatePay() : 0.0;
            double wage2 = (e2 instanceof Payment) ? ((Payment) e2).calculatePay() : 0.0;
            return Double.compare(wage2, wage1);
        });

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Average Monthly Wage: " + ((employee instanceof Payment) ? ((Payment) employee).calculatePay() : 0.0));
            System.out.println();
        }
    }
}

