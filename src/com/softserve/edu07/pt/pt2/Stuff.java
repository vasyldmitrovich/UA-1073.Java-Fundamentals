package com.softserve.edu07.pt.pt2;

public abstract class Stuff extends Person{
    private static final String TYPE_PERSON = "Stuff";

    public Stuff(String name) {
        super(name);
    }

    public abstract void salary();



    @Override
    public void print() {
        System.out.println("I am a ..." + getName());
    }
}
