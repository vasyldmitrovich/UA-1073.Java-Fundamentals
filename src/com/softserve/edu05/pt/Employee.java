package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {

    private final String name;
    private final int departmentNumber;
    private final int salary;
    private static int count = 0;
    private static Employee[] allEmployees = new Employee[5];

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        allEmployees[count] = this;
        count++;
    }

    private String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[" + name + ", salary " + salary + "]";
    }

    static void whoWorksInDep() {
        System.out.println("Lets find out, who works in department you chose.\nInput department number:");
        int tempDepNumb = new Scanner(System.in).nextInt();
        System.out.println("In department " + tempDepNumb + " work:");
        for (Employee e : allEmployees) {
            if (e.departmentNumber == tempDepNumb) System.out.println(e.getName());
        }
    }

    static void arrangeDescending() {
        System.out.println("Before sorting " + Arrays.toString(allEmployees));
        Employee[] tempArray = allEmployees;
        Employee temp;
        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[i].salary < tempArray[j].salary) {
                    temp = tempArray[i];
                    tempArray[i] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        System.out.println("After sorting " + Arrays.toString(tempArray));
    }
}
