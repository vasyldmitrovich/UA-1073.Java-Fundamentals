package com.softserve.edu07.pt;

public class Task_2 {
    public static void main(String[] args) {
        Person[] persons = new Person[6];
        persons[0] = new Teacher("Bob");
        persons[1] = new Teacher("Mark");
        persons[2] = new Student("Alice");
        persons[3] = new Student("Maks");
        persons[4] = new Cleaner("Vova");
        persons[5] = new Cleaner("Vitya");


        for (var person : persons) {
            person.print();
            if (person instanceof Staff staff) {
                person.salary();
            }
        }


    }

}


abstract class Person {
    abstract void print();

    String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person " + "name: " + name;
    }

    public void salary() {

    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    private static final String TYPE_PERSON = "Student";

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

abstract class Staff extends Person {
    private int salary;


    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public Staff(String name) {
        super(name);
    }

    @Override
    void print() {

    }

    public abstract void salary();
}

class Teacher extends Staff {

    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("My salary 28000");
    }

    @Override
    void print() {
        super.print();
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + getName());
    }

    @Override
    public String toString() {
        return "Cleaner " +
                "name " + name;
    }
}

class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("My salary 10000");
    }

    @Override
    void print() {
        super.print();
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + getName());
    }

    @Override
    public String toString() {
        return "Cleaner " +
                "name " + name;
    }
}