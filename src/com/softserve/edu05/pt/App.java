package com.softserve.edu05.pt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        // Task 1

        // task 1_1
        //Good
        String[] strings = SortStringArray.getStringArray(5);
        System.out.println("String array is: " + Arrays.toString(strings));
        SortStringArray.sort(strings);
        System.out.println("Sorted string array is: " + Arrays.toString(strings));


        // task 1_3
        System.out.println("Input string");
        String inputValue = SCANNER.nextLine();
        boolean contains = SortStringArray.containsString(strings, inputValue);

        if (contains) {
            System.out.println("Array contains " + inputValue);
        } else {
            System.out.println("Array doesn't contain " + inputValue);
        }

        // task 1_2
        int[] numbers = AverageNumber.getNumberArray(4);
        System.out.println("Number array is: " + Arrays.toString(numbers));
        int avg = AverageNumber.getAverage(numbers);
        System.out.println("Average is " + avg);


        // Task 2
        int positiveNumber = PrimeNumber.promptNumber();
        boolean isPrime = PrimeNumber.isPrime(positiveNumber);
        String primeMessage = isPrime ? " is prime" : " isn't prime";
        System.out.println(positiveNumber + primeMessage);

        // Task 3
        int[] integerArr = RandomIntArray.getRandomArray(5);
        RandomIntArray.outputInfo(integerArr);

        // Task 4
        Employee[] employees = new Employee[4];

        for (int i = 0; i < employees.length; i++) {
            Employee employee = promptEmployee();
            employees[i] = employee;
        }
        System.out.println("Enter department number to find employees");
        int department = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("All employees of " + department + " department: " + Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println("Sorted workers by salary in desc order: " + Arrays.toString(employees));
    }

    public static Employee promptEmployee() {
        Employee employee = new Employee();
        System.out.println("Enter name of employee" );
        String name = SCANNER.nextLine();
        employee.setName(name);

        System.out.println("Enter number of department for employee  " + name);
        int departmentNumber = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setDepartmentNumber(departmentNumber);

        System.out.println("Enter salary of emomployee " + name);
        int salary = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setSalary(salary);

        return employee;
    }

    public static Employee[] findEmployeesInDepartment (Employee[] employees, int department) {
        var filteredEmployees = new ArrayList<Employee>();
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == department) {
                filteredEmployees.add(employee);
            }
        }

        return filteredEmployees.toArray(new Employee[filteredEmployees.size()]);
    }

}
