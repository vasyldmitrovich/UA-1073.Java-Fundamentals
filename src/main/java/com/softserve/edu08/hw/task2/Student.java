package com.softserve.edu08.hw.task2;

import com.softserve.edu08.hw.task1.Person;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student(Student template){
        super(template);
        this.course = template.course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return course == student.course;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + course;
        return result;
    }

    @Override
    public Student clone() {
        return (Student) super.clone();
    }
}
