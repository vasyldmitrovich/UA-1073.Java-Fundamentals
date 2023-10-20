package com.softserve.edu09.hw;

import java.util.ArrayList;

class Student {
    private String name;
    private int group;
    private int course;
    private ArrayList<Integer> grades;

    public Student(String name, int group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "\nStudent name: " + getName() +
                ", group: " + getGroup() +
                ", course: " + getCourse() +
                ", grades: " + getGrades() +
                ", average grade: " + StudentService.averageGrade(getGrades());
    }
}
