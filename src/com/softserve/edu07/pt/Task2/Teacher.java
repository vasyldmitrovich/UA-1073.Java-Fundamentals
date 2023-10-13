package com.softserve.edu07.pt.Task2;

class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void salary() {
        super.salary();
    }

    @Override
    public void print() {
        System.out.println("My name is '" + getName() + "' and I am a '"
                + TYPE_PERSON + "'.");
    }
}

