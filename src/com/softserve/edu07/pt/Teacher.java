package com.softserve.edu07.pt;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher() {
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public double salary() {
        return getSalary();
    }

}
