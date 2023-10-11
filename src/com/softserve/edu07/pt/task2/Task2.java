package com.softserve.edu07.pt.task2;

public class Task2 {
    public static void main (String[] args) {
        Person[] persons = {
                new Teacher("Teacher1"),
                new Student("Student1"),
                new Cleaner("Cleaner"),
        };

        for (Person person: persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
