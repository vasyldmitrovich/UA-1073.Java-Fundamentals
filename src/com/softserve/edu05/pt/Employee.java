package com.softserve.edu05.pt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static com.softserve.edu05.pt.App.SCANNER;

public class Employee implements Comparable<Employee> {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee () {
        this("N/A", 0,0);
    }

    public int compareTo (Employee employee1) {
        int compareSalary = employee1.getSalary();

        return compareSalary - this.salary;
    }


    public Employee (String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getDepartmentNumber () {
        return departmentNumber;
    }

    public void setDepartmentNumber (int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
