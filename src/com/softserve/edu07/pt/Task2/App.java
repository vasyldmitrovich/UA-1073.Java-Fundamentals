package com.softserve.edu07.pt.Task2;

public class App {
    public class Task2 {
        public static void main(String[] args) {

            Person[] persons = new Person[7];
            persons[0] = new Teacher("Maria", 20000.0);
            persons[1] = new Cleaner("Ivan", 10000.0);
            persons[2] = new Student("Yura");
            persons[3] = new Teacher("Taras", 15000.0);
            persons[4] = new Cleaner("Petro", 7000.0);
            persons[5] = new Student("Natalia");
            persons[6] = new Teacher("Daria", 9800.0);

            for (Person person : persons) {
                person.print();
                if (person instanceof Staff) {
                    ((Staff) person).salary();
                }
            }
        }
    }
}