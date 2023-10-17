package com.softserve.edu08.pt.Task1;

public class App {
    public static void main(String[] args) {
        Department department1 = new Department("Department IT",
                new Department.Address("Lviv", "Chervonoyi Kalyny", 12)
        );

        Department department2 = department1.clone();
        System.out.println(department1);
        System.out.println(department2);
        department2.name = "Department IT 2";
        department2.address.city = "Kyiv";
        System.out.println(department1);
        System.out.println(department2);

    }




}
