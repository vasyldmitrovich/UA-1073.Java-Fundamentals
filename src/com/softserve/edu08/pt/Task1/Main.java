package com.softserve.edu08.pt.Task1;

public class Main {
    public static void main(String[] args) {
        Department dep1 = new Department(
                "dep1", new Department.Address("Lviv", "street1", 12)
        );
        Department dep2 = dep1.clone();
        System.out.println(dep1);
        System.out.println(dep2);
        dep2.adress.ciy = "Odessa";
        System.out.println(dep1);
        System.out.println(dep2);
    }
}
