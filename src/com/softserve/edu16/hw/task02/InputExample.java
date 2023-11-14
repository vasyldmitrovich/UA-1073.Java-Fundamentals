package com.softserve.edu16.hw.task02;

import java.util.ArrayList;
import java.util.List;

public class InputExample {
    private String name;
    private String group;
    private int course;
    private List<Subject> subjects = new ArrayList<>();

    public InputExample() {
    }

    public InputExample(String name, String group, int course, List<Subject> subjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", subjects=" + subjects +
                '}';
    }

    public double getAverageGrade() {
        double sum = 0.0;
        for (int i = 0; i < subjects.size(); i++) {
            sum += subjects.get(i).getGrade();
        }
        return sum / subjects.size();
    }

    public String info() {
        return String.format("Name: %s Group: %s Course: %d Average grade: %.2f", name, group, course, getAverageGrade());
    }
}

class Subject {
    private String subjectName;
    private int grade;

    public Subject() {
    }

    public Subject(String subjectName, int grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", grade=" + grade +
                '}';
    }
}

