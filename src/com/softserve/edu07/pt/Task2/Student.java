package com.softserve.edu07.pt.Task2;

public class Student extends Person{
    private static final String  TYPE_PERSON = "Student";

    @Override
    void print() {
        System.out.println("I`m " + name + " I`m a  " + TYPE_PERSON);
    }

    public Student(String name) {
        super(name);
    }
}
