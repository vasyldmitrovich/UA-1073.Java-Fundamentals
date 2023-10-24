package com.softserve.edu08.hw.task2;

public abstract class Person implements Cloneable{
    private int course;

    public Person(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public abstract String info();
    public abstract String activity();
}
