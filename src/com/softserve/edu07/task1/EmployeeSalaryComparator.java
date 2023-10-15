package com.softserve.edu07.task1;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return -Double.compare(o1.calculatePay(), o2.calculatePay());
    }
}
