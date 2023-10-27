package com.softserve.edu07.pt.task2;

class Student extends Person {
    public static final String TYPE_PERSON = " student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println(TYPE_PERSON + " not have salary");

    }
}
