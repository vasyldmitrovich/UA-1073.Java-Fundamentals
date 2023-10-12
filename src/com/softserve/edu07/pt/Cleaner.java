package com.softserve.edu07.pt;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, double salary) {
        super(name, salary);
    }

    public Cleaner(String name) {
        super(name);
    }

    public Cleaner() {
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
