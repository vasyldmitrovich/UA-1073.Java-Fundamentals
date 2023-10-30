package com.softserve.edu08.hw.Task1;

public class Student extends Person implements Cloneable{
    int course;


    @Override
    void info() {
        super.info();
        System.out.println(" Course: "+ course);
    }

    @Override
    String activity() {
        return "I study at university";
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    protected Student clone()  {
        try {
             return(Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
