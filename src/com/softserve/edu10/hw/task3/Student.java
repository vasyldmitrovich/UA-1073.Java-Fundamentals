package com.softserve.edu10.hw.task3;

import java.util.Comparator;
import java.util.Iterator;
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

    public static void printStudent(List<Student> students, int targetCourse) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println("Student:" + student.getName()
                        + ". Course:" + targetCourse);
            }
        }
    }

    public static Comparator<Student> compareByName = Comparator.comparing(Student::getName);

    public static Comparator<Student> compareByCourse = Comparator.comparing(Student::getCourse);

}
