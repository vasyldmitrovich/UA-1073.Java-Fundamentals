package com.softserve.edu08.hw.task2;

class Student extends Person {
    private final String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public Student cloneStudent(String newCourse) {
        return new Student(this.name, this.age, newCourse);
    }
}
