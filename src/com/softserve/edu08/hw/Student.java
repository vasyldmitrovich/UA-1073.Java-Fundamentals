package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable {
    private int course;

    public Student() {
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student(String firstName, String lastName, int age, int course) {
        super(new FullName(firstName, lastName), age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + getFullName() +
                ", age=" + getAge() +
                ", course=" + course +
                '}';
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
