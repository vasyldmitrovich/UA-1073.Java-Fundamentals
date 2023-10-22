package com.softserve.edu08.pt.task1;

public class Main {
    public static void main(String[] args) {
        Department unexpected = new Department("IT", new Department.Address("Київ", "Хрещатик", 5));
        Department copy = new Department(unexpected);

        System.out.println(unexpected);
        System.out.println(copy);

        copy.getAddress().setCity("Львів");
        copy.setName("Soft");
        copy.getAddress().setNumHouse(15);

        System.out.println(unexpected);
        System.out.println(copy);
    }
}
