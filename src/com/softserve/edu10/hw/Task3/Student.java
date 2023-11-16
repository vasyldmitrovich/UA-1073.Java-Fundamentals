package com.softserve.edu10.hw.Task3;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void printStudents(List<Student> students, int targetCourse) {
        System.out.println("Students in course " + targetCourse + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
        }
        System.out.println();
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.getName());
    }

    public static void sortByCourse(List<Student> students) {
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getCourse(), s2.getCourse()));
    }
}
