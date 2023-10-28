package com.softserve.edu08.hw.task2;

import com.softserve.edu08.hw.task1.FullName;
import com.softserve.edu08.hw.task1.Person;

public class Student extends Person implements Cloneable {
    private int course;

    public Student (FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student (String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }


    public int getCourse () {
        return course;
    }

    public void setCourse (int course) {
        this.course = course;
    }

    @Override
    public String info () {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity () {
        return "I study at the university";
    }

    @Override
    protected Student clone () throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
