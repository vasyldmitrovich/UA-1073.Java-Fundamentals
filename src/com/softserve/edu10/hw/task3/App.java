package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Andrii", 3));
        students.add(new Student("Ivan", 2));
        students.add(new Student("Petro", 1));
        students.add(new Student("Mykola", 3));
        students.add(new Student("Oleg", 1));

        System.out.println(students);

        Collections.sort(students, new Student.StudentCourseComparator());
        System.out.println(students);

        Collections.sort(students, new Student.StudentNameComparator());
        System.out.println(students);

        Student.printStudents(students, 3);
    }
}
