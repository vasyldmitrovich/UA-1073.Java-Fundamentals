package com.softserve.edu10.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nataliya Shevchuk", 2));
        students.add(new Student("Maria Vasilenko", 1));
        students.add(new Student("Lydia Kravchuk", 3));
        students.add(new Student("Orest Tkachenko", 1));
        students.add(new Student("Oleksiy Hryhorenko", 2));

        Collections.sort(students, Student.compareByName());
        Student.printStudents(students, 1);

        System.out.println("===================");
        Collections.sort(students, Student.compareByCourse());
        Student.printStudents(students, 2);

    }

}
