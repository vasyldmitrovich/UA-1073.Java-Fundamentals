package com.softserve.edu07.pt.task2;

public class App {
    public static void main(String[] args) {
        Person[] people = new Person[6];
        people[0] = new Teacher("John");
        people[1] = new Teacher("Alice");
        people[2] = new Cleaner("Bob");
        people[3] = new Cleaner("Eve");
        people[4] = new Student("Mike");
        people[5] = new Student("Sarah");

        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
