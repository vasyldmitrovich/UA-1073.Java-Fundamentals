package com.softserve.edu08.pt.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department(
                "IT",
                new Department.Address("Lviv", "Chervonoi Kalyny", 12)
        );
        Department department2 = department1.clone();

        System.out.println(department1);
        System.out.println(department2);
        department2.name = "IT2";
        department2.address.city = "Kyiv";
        System.out.println(department1);
        System.out.println(department2);



    }
}
