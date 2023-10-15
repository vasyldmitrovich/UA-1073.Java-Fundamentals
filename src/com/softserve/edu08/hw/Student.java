package com.softserve.edu08.hw;

class Student extends Person implements Cloneable {
    private int course;

    Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", course - " + getCourse();
    }

    @Override
    String activity() {
        return "I study at university";
    }

    @Override
    protected Student clone() {
        Student copy = null;
        try {
            copy = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        copy.setFullName(this.getFullName().clone());
        return copy;
    }
}
