package com.softserve.edu07.pt.pt2;

public class Teacher extends Stuff{
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a ... " + getName());
    }

    @Override
    public void salary() {
        System.out.println("Teachers salary is about 3 000 $");
    }
}
