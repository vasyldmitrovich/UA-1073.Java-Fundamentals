package com.softserve.edu07.pt;

public class Task2 {
    public static void task2() {
        Person[] persons = new Person[]{
                new Teacher("Ivan", 3200),
                new Cleaner("Petro", 800),
                new Student("Andrii")
        };

        for (Person person : persons) {
            if (person instanceof Staff) {
                System.out.println(person.getName() + "`s salary is " + ((Staff) person).salary() + "$");
            }
            person.print();
        }
    }
}
