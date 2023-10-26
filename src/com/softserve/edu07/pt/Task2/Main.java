package com.softserve.edu07.pt.Task2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Teacher("Maria"),
                new Cleaner("Anna"),
                new Student("Bob")
        };
        for (var per : persons) {
            per.print();
            if (per instanceof Staff) {
                System.out.println("My salary is "+((Staff) per).salary() + " $");
            }
        }
    }
}
