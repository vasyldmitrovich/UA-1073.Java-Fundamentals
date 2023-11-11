package com.softserve.edu07.pt;

abstract class Person {
    protected String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
        System.out.println("Creating a " + TYPE_PERSON + " named " + name);
    }

    public abstract void print();
}

abstract class Staff extends Person {
    public static final String TYPE_STAFF = "Staff";

    public Staff(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_STAFF + " named " + name);
    }

    public abstract void salary();
}

class Teacher extends Staff {
    public static final String TYPE_TEACHER = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_TEACHER + " named " + name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_TEACHER);
    }

    @Override
    public void salary() {
        System.out.println("Calculating salary for Teacher " + name);
    }
}

class Cleaner extends Staff {
    public static final String TYPE_CLEANER = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_CLEANER + " named " + name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_CLEANER);
    }

    @Override
    public void salary() {
        System.out.println("Calculating salary for Cleaner " + name);
    }
}

class Student extends Person {
    public static final String TYPE_STUDENT = "Student";

    public Student(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_STUDENT + " named " + name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_STUDENT);
    }
}

public class hw2 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Teacher("John");
        people[1] = new Cleaner("Alice");
        people[2] = new Student("Bob");
        people[3] = new Teacher("Eve");
        people[4] = new Cleaner("Dave");

        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println();
        }
    }
}

