package com.softserve.edu07.pt.pt2;

public class Cleaner extends Stuff{
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a ... " + getName());
    }

    @Override
    public void salary() {
        System.out.println("Cleaners salary is about 2 000 $");
    }
}
