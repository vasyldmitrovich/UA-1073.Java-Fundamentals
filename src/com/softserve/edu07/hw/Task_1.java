package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

public class Task_1 {


    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("S001", "John", "123-45-6789", 4000.0);
        employees[1] = new ContractEmployee("C001", "Alice", "987-65-4321", 20.0, 160.0);
        employees[2] = new SalariedEmployee("S002", "Bob", "234-56-7890", 4500.0);
        employees[3] = new ContractEmployee("C002", "Mary", "876-54-3210", 22.0, 150.0);
        employees[4] = new SalariedEmployee("S003", "David", "345-67-8901", 4200.0);

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                double pay1 = emp1.calculatePay();
                double pay2 = emp2.calculatePay();
                return Double.compare(pay2, pay1);
            }
        });

        for (Employee employee : employees) {
            employee.print();
            System.out.println("Average Monthly Wage: " + employee.calculatePay());
            System.out.println();
        }
    }

}

interface Payment {
    double calculatePay();
}

abstract class Employee {
    protected String employeeId;
    protected String name;


    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract void print();

    public double calculatePay() {
        return 0;
    }
}

class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public void print() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Type: Salaried Employee");
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}

class ContractEmployee extends Employee implements Payment {
    private String federalTaxId;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxId, double hourlyRate, double hoursWorked) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void print() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Type: Contract Employee");
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}