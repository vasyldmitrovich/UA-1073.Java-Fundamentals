package com.softserve.edu10.hw.task3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> students, Integer course) {
        var it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.course == course) {
                System.out.println(student);
            }
        }
    }

    public static class StudentNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }


    public static class StudentCourseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
