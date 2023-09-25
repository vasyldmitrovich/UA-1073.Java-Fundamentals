package com.softserve.edu03.pt;

public class Task2 {

    //The same with name of this method
    public static void task2(String... args) {
        Employee employee1 = new Employee("Alex", 7, 49);
        Employee employee2 = new Employee("Sofia", 9);
        Employee employee3 = new Employee();

        Employee.initializeEmployee(employee3);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Salary of '" + employee1.getName() + "' is " + employee1.getSalary());
        System.out.println("Salary of '" + employee2.getName() + "' is " + employee2.getSalary());
        System.out.println("Salary of '" + employee3.getName() + "' is " + employee3.getSalary());

        System.out.println("Bonus to the salary of '" + employee1.getName() + "' is " + employee1.getBonuses());
        System.out.println("Bonus to the salary of '" + employee2.getName() + "' is " + employee2.getBonuses());
        System.out.println("Bonus to the salary of '" + employee3.getName() + "' is " + employee3.getBonuses());

        System.out.println("Total salary: " + Employee.getTotalSum());

    }
}

