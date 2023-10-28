package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student's name (or type 'exit' to finish): ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                break;
            }

            System.out.println("Enter student's group: ");
            int group = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter student's course: ");
            int course = Integer.parseInt(scanner.nextLine());

            Student student = new Student(name, group, course);

            // Введення оцінок студента
            while (true) {
                System.out.println("Enter student's grade (or type 'done' to finish entering grades): ");
                String input = scanner.nextLine();
                if (input.equals("done")) {
                    break;
                }
                double grade = Double.parseDouble(input);
                student.addGrade(grade);
            }

            students.add(student);
        }

        int courseToPrint = 1;
        printStudents(students, courseToPrint);
    }

    public static void printStudents(List<Student> students, int course) {
        if (students.isEmpty()) {
            System.out.println("No students found in the collection.");
            return;
        }

        System.out.println("Students enrolled in course " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students found in course " + course + ".");
        } else {
            int nextCourseCount = 0;
            int notPromotedCount = 0;
            System.out.println();
            System.out.println("Details:");

            for (Student student : students) {
                if (student.getCourse() == course) {
                    if (student.calculateGPA() >= 5.0) {
                        nextCourseCount++;
                    } else {
                        notPromotedCount++;
                        System.out.println("Student not promoted: " + student.getName());
                    }
                }
            }

            System.out.println("Number of students moving to the next course: " + nextCourseCount);
            System.out.println("Number of students not promoted: " + notPromotedCount);
        }
    }
}