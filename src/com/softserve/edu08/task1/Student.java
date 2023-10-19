package com.softserve.edu08.task1;

public class Student extends Person implements Cloneable {
    private int courseNumber;

    public Student(FullName fullName, int age, int courseNumber) {
        super(fullName, age);
        this.courseNumber = courseNumber;
    }

    @Override
    public String info() {
        return "First name: " + super.getFullName().getFirstName() +
                ", Last name: " + super.getFullName().getLastName() +
                ", Age: " + super.getAge() +
                ", Course: " + courseNumber;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        FullName nameCopy = (FullName) super.getFullName().clone();
        return new Student(nameCopy, super.getAge(), courseNumber);
    }
}
