package com.softserve.edu07.pt.pt2;

public class Student extends Person{
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a ... " + getName());
    }
}
