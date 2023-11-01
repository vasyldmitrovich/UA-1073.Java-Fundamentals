package com.softserve.edu08.hw.task1;

public class Student extends Person implements Cloneable {
    private int numberCourse;

    public Student(FullName fullName, int age, int numberCourse) {
        super(fullName, age);
        this.numberCourse = numberCourse;
    }

    @Override
    public String activity() {
        return "I`m student.";
    }

    @Override
    public String info() {
        return "First name: " + super.getFullName().getFirstName()
                + ". last name: " + super.getFullName().getLastName()
                + ". age: " + getAge() + " years. Course: " + numberCourse;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
