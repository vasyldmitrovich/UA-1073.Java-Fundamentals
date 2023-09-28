package com.softserve.edu03.pt;

public class App {

    public static void main(String[] args) {
        Employee e1 = new Employee("John",14,8);
        Employee e2 = new Employee("Karin",10,24);
        Employee e3 = new Employee("Mike",30,12);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        int salary1 = e1.getSalary(14,8);
        int salary2 = e1.getSalary(10,24);
        int salary3 = e1.getSalary(30,12);
        System.out.println("Total salary of all employees: " + (salary3+salary2+salary1) + "$");


    }
}
