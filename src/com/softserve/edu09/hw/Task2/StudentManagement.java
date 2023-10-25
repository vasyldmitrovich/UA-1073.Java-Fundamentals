package com.softserve.edu09.hw.Task2;

import java.util.List;
import java.util.ArrayList;

public class StudentManagement {
    public static void removeUnderperformingStudents(List<Student> students) {
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.calculateGPA() < 3.0) {
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);
        for (Student student : students) {
            student.promoteIfPossible();
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in Course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Add some students to the collection
        students.add(new Student("Ivan", "A", 1, List.of(90, 85, 88)));
        students.add(new Student("Oleksii", "B", 2, List.of(75, 80, 72)));
        students.add(new Student("Valentyn", "A", 1, List.of(92, 87, 89)));
        students.add(new Student("Maryna", "C", 3, List.of(68, 75, 80));

        printStudents(students, 2);

        removeUnderperformingStudents(students);

        System.out.println("\nAfter Removing Underperforming Students:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }
    }
}
