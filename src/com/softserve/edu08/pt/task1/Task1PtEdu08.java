package com.softserve.edu08.pt.task1;

public class Task1PtEdu08 {
    public static void task1() {
        Department.Address address1 = new Department.Address("New York", "sgv. Central Park", 61);

        Department department1 = new Department("OBSE", address1);

        Department department2 = department1.clone();

        System.out.println(department1);
        System.out.println(department2);

        department2.address.city = "Briukhovychi";

        System.out.println(department1);
        System.out.println(department2);




    }
}
