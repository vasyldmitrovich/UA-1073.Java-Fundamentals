package com.softserve.edu07.pt.task2;

class Teacher extends Staff {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getTypePerson() {
        return "Teacher";
    }

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    @Override
    public void salary() {
        System.out.println("Teacher's salary");
    }
}