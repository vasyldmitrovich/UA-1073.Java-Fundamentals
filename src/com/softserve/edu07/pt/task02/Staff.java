package com.softserve.edu07.pt.task02;

public abstract class Staff extends Person {
    public Staff() {
        super();
    }

    public Staff(String name) {
        super(name);
    }

    public abstract double salary();
}
