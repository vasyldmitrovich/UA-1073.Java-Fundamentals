package com.softserve.edu07.pt.task2;

class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println(TYPE_PERSON + " " + name + " is a student and does not receive a salary.");
    }
}