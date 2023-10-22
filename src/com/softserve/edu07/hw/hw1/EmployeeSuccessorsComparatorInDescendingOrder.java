package com.softserve.edu07.hw.hw1;

import java.util.Comparator;

public class EmployeeSuccessorsComparatorInDescendingOrder implements Comparator <Employee> {//Too long name of class

    @Override
    public int compare(Employee o1, Employee o2) {
        int o1s;
        int o2s;
        if (o1 instanceof ContractEmployee){
            o1s = ((ContractEmployee) o1).calculatePay();
        } else {
            o1s = ((SalariedEmployee) o1).calculatePay();
        }
        if (o2 instanceof ContractEmployee){
            o2s = ((ContractEmployee) o2).calculatePay();
        } else {
            o2s = ((SalariedEmployee) o2).calculatePay();
        }
            return Integer.compare(o1s, o2s);
    }
}
