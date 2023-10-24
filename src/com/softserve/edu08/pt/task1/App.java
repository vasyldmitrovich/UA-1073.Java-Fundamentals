package com.softserve.edu08.pt.task1;

public class App {
    public static void main(String[] args) {
        Department department1 = new Department(
                "department1",
                new Department.Address("Poltava","Central st.",12)
        );
        Department department2 = department1.clone();
        System.out.println(department2);
        System.out.println(department1);
        department2.name = "IT2";
        department2.address.city = "Kyiv";
        System.out.println(department2);
        System.out.println(department1);
    }
}
