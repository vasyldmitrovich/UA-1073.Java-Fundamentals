package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Double> average1 = new ArrayList<>();
        average1.add(2.5);
        average1.add(1.6);
        average1.add(5.0);
        students.add(new Student("Boni", "medicine", 1, average1));

        List<Double> average2 = new ArrayList<>();
        average2.add(2.4);
        average2.add(3.9);
        average2.add(5.0);
        students.add(new Student("Herda", "medicine", 2, average2));

        List<Double> average3 = new ArrayList<>();
        average3.add(4.5);
        average3.add(3.0);
        average3.add(5.9);
        students.add(new Student("Lucas", "medicine", 1, average3));

        List<Student> beststudents = new ArrayList<>();
        for (Student student : students) {
            if (student.averageGrades() >= 3.0) {
                beststudents.add(student);
            }
        }
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Average Grades: " + student.averageGrades());
            System.out.println();
        }

    }
}
