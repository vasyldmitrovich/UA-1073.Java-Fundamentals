package com.softserve.edu10.hw.Task3;

import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public static void printStudents(List<Student> students, int targetCourse) {
        System.out.println("\nNames of the students from the list who are enrolled in the specified course:");
        for (Student student : students) {
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
        }
    }

    public static void sortByName(List<Student> students) {
        System.out.println("\nList of students sorted by name:");
        students.sort(Comparator.comparing(Student::getName));
    }

    public static void sortByCourse(List<Student> students) {
        System.out.println("\nList of students sorted by course:");
        students.sort(Comparator.comparingInt(Student::getCourse));
    }
}

