package com.softserve.edu08.hw.task2;

import com.softserve.edu08.pt.task1.Department;

public class Student extends Person implements Cloneable {

    public Student(int course) {
        super(course);
    }

    @Override
    public String activity() {
        return "Im studing at university";
    }

    @Override
    public String info() {
        return "This student on " + getCourse() + " of university";
    }
    public Student clone() {
        try {
            Student copy = (Student) super.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
