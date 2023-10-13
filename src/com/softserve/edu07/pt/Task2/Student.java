package com.softserve.edu07.pt.Task2;

class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("My name is: " + getName() + " and I am a '"
                + TYPE_PERSON + "'.");
    }
}