package com.softserve.edu10.hw.Task3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentManagement {
    public static void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students enrolled in course " + courseNumber + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alex", 101));
        students.add(new Student("Borys", 102));
        students.add(new Student("Vasyl", 101));
        students.add(new Student("Dmytro", 103));
        students.add(new Student("Maria", 102));

        //Students sorted by name
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        // Students sorted by course
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getCourse(), s2.getCourse()));
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        // Students enrolled in course 101
        printStudents(students, 101);
    }
}
