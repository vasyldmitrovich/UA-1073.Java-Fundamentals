package com.softserve.edu03.hw;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = Task1.createTriangle();
//        System.out.printf("The area of the triangle is %.4f\n", task1.getArea());

//        Task2 task2 = new Task2();
//        System.out.printf("The smallest number is %d", task2.findMinNumber());

        Person person1 = new Person();
        Person person2 = new Person("Bohdan", "Bohdan");
        Person person3 = new Person("Ivan", "Ivanov", 1991);
        Person person4 = new Person("Vasya", "Ivanov", 2005);
        Person person5 = new Person("Ira", "Ivanova", 2015);

        System.out.println(person1.output());
        System.out.println(person2.output());
        System.out.println(person3.output());
        System.out.println(person4.output());
        System.out.println(person5.output());

        person1.input();

        System.out.println(person1.output());
    }
}
