package com.softserve.edu07.pt;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    public Student() {
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
