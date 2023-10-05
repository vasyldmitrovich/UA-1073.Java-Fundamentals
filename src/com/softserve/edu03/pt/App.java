package com.softserve.edu03.pt;

public class App {

    public static void main(String[] args) {
        // Task 1

        Task1.getNumber();

        //Task 2

        System.out.println(new Employee("Rob Stark", 5, 5));
        System.out.println(new Employee("Anakin Skywalker", 6, 15));
        System.out.println(new Employee("Gandalf", 400, 700));
        System.out.println(Employee.totalSalary());//Good


    }
}
