package com.softserve.edu06.task2;

public class App {
    public static void main(String[] args) {//All is good
        Employee employee = new Employee("John", 32, 40000);
        Developer developer = new Developer("Nick", 25, 30000, "Java Developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
