package com.softserve.edu06.hw.task02;

public class App {
    public static void main(String[] args) {
        var employee = new Employee("Helen", 25, 43499.00);
        var developer = new Developer("John", 29, 54999.00, "Junior Java Developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
