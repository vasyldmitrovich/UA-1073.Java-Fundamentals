package com.softserve.edu07.task1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new HourlyPaidEmployee("1", "327632734", 1.25, 6),
                new FixedPaidEmployee("2", "s28d3f4d4", 20000),
                new FixedPaidEmployee("3", "43djgf343", 30000),
                new HourlyPaidEmployee("4", "4837321", 2.25, 8)
        };

        Arrays.sort(employees, new EmployeeSalaryComparator());

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId());
        }
    }
}
