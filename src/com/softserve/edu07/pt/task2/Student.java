package com.softserve.edu07.pt.task2;

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String getTypePerson() {
        return "Student";
    }

    @Override
    public void print() {
        System.out.println("I am a student");
    }
}