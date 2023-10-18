package com.softserve.edu09.hw.task2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Subject> grades;

    public Student () {
        this("", "", 0, null);
    }

    public Student (String name, String group, int course, List<Subject> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade () {
        int sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i).getGrade();
        }

        return (double) sum / grades.size();
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getGroup () {
        return group;
    }

    public void setGroup (String group) {
        this.group = group;
    }

    public int getCourse () {
        return course;
    }

    public void setCourse (int course) {
        this.course = course;
    }

    public List<Subject> getGrades () {
        return grades;
    }

    public void setGrades (List<Subject> grades) {
        this.grades = grades;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
