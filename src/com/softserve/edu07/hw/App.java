package com.softserve.edu07.hw;

import com.softserve.edu07.hw.hw1.ContractEmployee;
import com.softserve.edu07.hw.hw1.Employee;
import com.softserve.edu07.hw.hw1.EmployeeDescendingOrder;
import com.softserve.edu07.hw.hw1.SalariedEmployee;
import com.softserve.edu07.hw.hw2.TestVehicles;

import java.util.Arrays;

class App {

    public static void main(String[] args) {


//Hw 1 - Employees
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("Peto", "11111111", 5_000);
        employees[1] = new ContractEmployee("Taras", "77777777", 300, 7);
        employees[2] = new ContractEmployee("Dmytro", "88888888", 250, 6);
        employees[3] = new SalariedEmployee("John", "33333333", 4_000);
        employees[4] = new ContractEmployee("Alice", "44444444", 220, 8);

        Arrays.sort(employees, new EmployeeDescendingOrder());

        for (Employee empl: employees) {
            System.out.println(empl);
        }

//Hw 2 - Vehicles

        TestVehicles.testVehicles();
    }
}
