package com.softserve.edu07.pt.task2;

public class Teacher extends Staff {
    public final static String TYPE_PERSON = "Teacher";

    public Teacher (String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    void print () {
        System.out.println("I am a teacher");
    }

    @Override
    void salary () {
        System.out.println("Teacher's salary");
    }
}
