package com.softserve.edu09.hw.Task2;
import java.util.ArrayList;
import java.util.List;
import static com.softserve.edu09.hw.Task2.StudentManagement.printStudents;
import static com.softserve.edu09.hw.Task2.StudentManagement.removeUnderperformingStudents;

public class App {
    public static void main(String[] args) {
    // Create a collection to hold all objects
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("Marta", "A", 2, List.of(5, 3, 2)));
    studentList.add(new Student("Ostap", "B", 2, List.of(3, 2, 3)));
    studentList.add(new Student("Ratya", "C", 1, List.of(1, 1, 2)));

    System.out.println("Initial state:");
    for (Student student : studentList) {
        System.out.println(student.getName() + ", Course: " + student.getCourse() +
                ", Average Grade: " + student.getAverageGrade());
    }

    removeUnderperformingStudents(studentList);

    System.out.println("\nFinal state:");
    for (Student student : studentList) {
        System.out.println(student.getName() + ", Course: " + student.getCourse() +
                ", Average Grade: " + student.getAverageGrade());
    }

    printStudents(studentList, 2);
    }
}

