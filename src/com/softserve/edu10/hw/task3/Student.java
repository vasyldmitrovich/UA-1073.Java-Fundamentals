package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
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

    @Override
    public int compareTo(Student otherStudent) {
        // Compare students by name
        return this.name.compareTo(otherStudent.name);
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students in course " + course + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();


        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Eve", 2));


        Collections.sort(students);
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }


        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getCourse(), s2.getCourse()));
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        printStudents(students, 1);
    }
}
