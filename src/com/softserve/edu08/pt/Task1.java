package com.softserve.edu08.pt;

public class Task1 {
    public static void task1() {
        Department department = new Department("Dep1", new Department.Address("Ivano-Frankivsk", "Chornovola", 15));
        Department cloneDepartment = department.clone();

        printDepartments(department, cloneDepartment);

        System.out.println("+=".repeat(50));
        cloneDepartment.getAddress().setCity("Lviv");

        printDepartments(department, cloneDepartment);

    }

    public static void printDepartments(Department d1, Department d2) {
        System.out.println(d1);
        System.out.println(d2);
    }
}
