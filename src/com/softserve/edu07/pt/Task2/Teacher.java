package com.softserve.edu07.pt.Task2;

public class Teacher  extends Staff{
    private static final String  TYPE_PERSON = "Teacher";

    @Override
    public int salary() {
        return 100;
    }

    @Override
    public void print() {
        System.out.println("I`m " + name + " I`m a  " + TYPE_PERSON);
    }

    public Teacher(String name) {
        super(name);
    }
}
