package com.softserve.edu03.pt;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // EXAMPLE
        Student.printUserStats();

        Student student1 = new Student();
        Student.promptParameters(student1);

        Student.printUserStats();

        Student student2 = new Student();
        Student.promptParameters(student2);

        Student.printUserStats();

        Student student3 = new Student();
        Student.promptParameters(student3);

        Student.printUserStats();

        // Task 1
        Number number = new Number();

        Number.setNumbers(number);
        Number.printInfo(number);

        //Task2
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        Employee.inputInfo(emp1);
        Employee.inputInfo(emp2);
        Employee.inputInfo(emp3);

        System.out.println(Employee.getTotalSum());
    }
}
