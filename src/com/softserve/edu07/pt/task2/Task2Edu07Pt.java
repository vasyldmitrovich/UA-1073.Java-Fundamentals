package com.softserve.edu07.pt.task2;

public class Task2Edu07Pt {
    public static void task2() {

        Person[] persons = {
                new Cleaner("Boni", false),
                new Student("Artur"),
                new Teacher("Galina Oleksiivna", true)

        };

        for (Person person : persons) {
            person.print();
            person.salary();
            System.out.println(" ");


        }
    }
}
