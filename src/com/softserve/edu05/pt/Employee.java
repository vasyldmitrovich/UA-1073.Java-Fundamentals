package com.softserve.edu05.pt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static com.softserve.edu05.pt.App.SCANNER;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public static Employee promptParameter() {
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

    public Employee () {
        this("N/A", 0,0);
    }
    private static Comparator<Employee> EmployeeSalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare (Employee employee1, Employee employee2) {
            return employee1.compareTo(employee2);
        };
    };
    public int compareTo (Employee employee1) {
        int compareSalary = employee1.getSalary();

        return compareSalary - this.salary;
    }


    public Employee (String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
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

    public static void sortBySalaryDesc(Employee[] employees) {
        Arrays.sort(employees, EmployeeSalaryComparator);
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
