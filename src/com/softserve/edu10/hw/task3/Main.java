package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Artur", 1));
        students.add(new Student("Boni", 2));
        students.add(new Student("Herda", 1));
        students.add(new Student("Lucas", 2));
        students.add(new Student("Jack", 1));

        System.out.println("Sorted by name.");
        students.sort(Student.compareByName);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
        System.out.println();

        System.out.println("Sorted by course.");
        students.sort(Student.compareByCourse);
        for (Student student : students) {
            System.out.println("Student:" + student.getName() + " course " + student.getCourse());
        }


    }

}
