package com.softserve.edu07.pt.task02;

public class Student extends Person {
    private final String TYPE_PERSON = "Student";

    public Student() {
        super();
        System.out.println("Person type " + TYPE_PERSON + " created.");
    }

    public Student(String name) {
        super(name);
        System.out.println("Person type " + TYPE_PERSON + " created.");
    }

    public String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
