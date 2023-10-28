package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;


class Student {
    private final String name;
    private final int group;
     int course;
    private final List<Double> grades;

    public Student(String name, int group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }
}