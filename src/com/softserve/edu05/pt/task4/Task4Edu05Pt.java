package com.softserve.edu05.pt.task4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Task4Edu05Pt {
    public static void task4Edu05Pt() {
        Employee employee1 = new Employee("Katia", 1, 7800);
        Employee employee2 = new Employee("Boni", 2, 6300);
        Employee employee3 = new Employee("Herda", 1, 4200);
        Employee employee4 = new Employee("Art", 3, 5100);
        Employee employee5 = new Employee("Oleksandra", 3, 10000);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter department number: ");
        int departmentNumber = scan.nextInt();

        System.out.println("Employees in department " + departmentNumber + ": ");
        for (Employee employee : new Employee[]{employee1, employee2, employee3, employee4, employee5}) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
            }
        }

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.println("Employees arranged by salary in descending order: " );
        for (Employee employee : employees) {
            System.out.println(employee);
        }



    }

}
