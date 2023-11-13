package com.softserve.edu07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int employeeId;
    private String name;
    private String paymentType;
    private double hourlyRate;
    private int hoursWorked;
    private double fixedMonthlyPayment;
    private double averageMonthlySalary;

    public Employee(int employeeId, String name, String paymentType, double hourlyRate, int hoursWorked, double fixedMonthlyPayment) {
        this.employeeId = employeeId;
        this.name = name;
        this.paymentType = paymentType;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double calculateAverageMonthlySalary() {
        if ("Hourly".equals(paymentType)) {
            return hourlyRate * hoursWorked;
        } else if ("Fixed".equals(paymentType)) {
            return fixedMonthlyPayment;
        } else {
            return 0;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Dima Sidor", "Hourly", 15, 160, 0));
        employees.add(new Employee(2, "Maksym Grechka", "Fixed", 0, 0, 3000));
        employees.add(new Employee(3, "Fredi Fazber", "Fixed", 0, 0, 2400));
        employees.add(new Employee(4, "Liubomyr Stetsiuk", "Hourly", 20, 140, 0));

        for (Employee employee : employees) {
            employee.setAverageMonthlySalary(employee.calculateAverageMonthlySalary());
        }

        Collections.sort(employees, Comparator.comparingDouble(Employee::getAverageMonthlySalary).reversed());

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId() +
                    ", Name: " + employee.getName() +
                    ", Average Monthly Wage: " + employee.getAverageMonthlySalary());
        }
    }
}

