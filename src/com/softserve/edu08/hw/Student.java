package com.softserve.edu08.hw;

public class Student extends Person {

    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Курс: " + course;
    }

    @Override
    public String activity() {
        return "Я навчаюся в університеті на курсі " + course;
    }
}
