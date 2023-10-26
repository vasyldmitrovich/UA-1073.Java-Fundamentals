package com.softserve.edu07.hw.Task1;

import java.util.Comparator;

public class SortByAverageMonthlyWage implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return - Integer.compare(o1.calculatePay(),o2.calculatePay());
    }
}
