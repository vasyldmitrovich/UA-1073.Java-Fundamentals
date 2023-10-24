package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Double> grades1 = new ArrayList<>();
        grades1.add(3.5);
        grades1.add(4.0);
        students.add(new Student("Adam", 021, 3, grades1));

        List<Double> grades2 = new ArrayList<>();
        grades2.add(7.3);
        grades2.add(2.5);
        students.add(new Student("Sophia", 021, 1, grades2));

        List<Double> grades3 = new ArrayList<>();
        grades3.add(1.1);
        grades3.add(3.4);
        students.add(new Student("Eve", 021, 3, grades3));

        List<Student> studentsToKeep = new ArrayList<>();

        for (Student student : students) {
            if (student.averageGrades() >= 3.0) {
                student.promoteIfPossible();
                studentsToKeep.add(student);
            }
        }

        students = studentsToKeep;

        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }
    }
}
