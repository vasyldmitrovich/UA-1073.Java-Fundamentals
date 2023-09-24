package com.softserve.edu03.pt;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bohdan", 125, 8);
        Employee employee2 = new Employee("Ivan");
        Employee employee3 = new Employee();

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Total sum = " + Employee.getTotalSum());

        employee2.setRate(134);
        employee2.setHours(10);

        System.out.println("Total sum = " + Employee.getTotalSum());

        employee2.setRate(100);

        System.out.println("Total sum = " + Employee.getTotalSum());

        System.out.println(employee1.getBonuses());
        System.out.println(employee2.getBonuses());
        System.out.println(employee3.getBonuses());
    }
}
