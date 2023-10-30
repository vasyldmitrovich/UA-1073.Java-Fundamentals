package com.softserve.edu09.hw.task2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> marks;

    public Student(String name, String group, int course, List<Double> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
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

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> marks) {
        this.marks = marks;
    }

    public double calculateAverageMark() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    public void promoteToNextCourse() {
        if (calculateAverageMark() >= 3.0) {
            course++;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Student on course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
