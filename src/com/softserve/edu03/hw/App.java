package com.softserve.edu03.hw;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // task 1
        TriangleArea task1 = new TriangleArea();
        TriangleArea.promptParameters(task1);
        double area = task1.getArea();

        System.out.printf("The area of the triangle is %.2f%n", area);

        // task 2
        MinNumber task2 = new MinNumber();

        MinNumber.promptParameters(task2);
        int minNumber = MinNumber.getMinNumber(task2);
        System.out.println("The minimum number is " + minNumber);

        // task 3

        Person person1 = new Person();
        Person.input(person1);

        Person person2 = new Person();
        Person.input(person2);

        Person person3 = new Person();
        Person.input(person3);

        Person person4 = new Person();
        Person.input(person4);

        Person person5 = new Person();
        Person.input(person5);

        Person.output(person1);
        Person.output(person2);
        Person.output(person3);
        Person.output(person4);
        Person.output(person5);
    }
}
