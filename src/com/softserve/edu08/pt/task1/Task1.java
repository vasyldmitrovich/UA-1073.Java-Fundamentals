package com.softserve.edu08.pt.task1;

public class Task1 {
    public static void main (String[] args) {
        Department dep1 = new Department("Front-end", "Kyiv", "Kyivska", 1000);
        Department dep2 = null;

        try {
            dep2 = (Department) dep1.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        dep2.getAddress().setCity("Odessa");

        System.out.println("Department 1: " + dep1);
        System.out.println("Department 2 (cloned from department 1): " + dep2);
    }
}
