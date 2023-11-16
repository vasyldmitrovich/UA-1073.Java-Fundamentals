package com.softserve.edu10.hw.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marta", 2));
        students.add(new Student("Ostap", 2));
        students.add(new Student("Katya", 1));
        students.add(new Student("Rusya", 1));
        students.add(new Student("Mary", 2));

        System.out.println("Students sorted by name:");
        Collections.sort(students);
        printStudentList(students);

        System.out.println("Students sorted by course:");
        Student.sortByCourse(students);
        printStudentList(students);
    }

    private static void printStudentList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + " course " + student.getCourse());
        }
        System.out.println();
    }
}
