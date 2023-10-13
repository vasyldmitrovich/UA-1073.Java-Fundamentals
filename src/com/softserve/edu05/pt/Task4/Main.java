package com.softserve.edu05.pt.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee.createEmployeeArrey();
        Employee.sortBySalary(Employee.employees);
        Employee.printSortedObject();
        Employee.search();
    }



}
