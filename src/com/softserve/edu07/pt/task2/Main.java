package com.softserve.edu07.pt.task2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[6];
        people[0] = new Teacher("John", 10, true);
        people[1] = new Cleaner("Alice", 180, true);
        people[2] = new Student("Bob");
        people[3] = new Teacher("Eva", 5, false);
        people[4] = new Cleaner("Mark", 160, false);
        people[5] = new Student("Sarah");

        for (Person person : people) {
            person.print();
            person.salary();
            System.out.println();
        }
    }
}