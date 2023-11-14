package com.softserve.edu08.pt.Task1;

public class App {
    public static void main(String[] args) {

        Department.Address address1 = new Department.Address("Lviv", "Shyroka", 91);
        Department department1 = new Department("smth", address1);
        Department department2 = department1.clone();

        System.out.println(department1);
        System.out.println(department2);

        department2.address.city = "Kyiv";

        System.out.println(department1);
        System.out.println(department2);


    }
}
