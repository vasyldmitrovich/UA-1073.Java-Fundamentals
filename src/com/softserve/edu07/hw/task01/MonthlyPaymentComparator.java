package com.softserve.edu07.hw.task01;

import java.util.Comparator;

public class MonthlyPaymentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1 instanceof Payment && o2 instanceof Payment) {
            return (int) (((Payment) o1).calculatePay() - ((Payment) o2).calculatePay());
        }
        throw new ClassCastException();
    }
}
