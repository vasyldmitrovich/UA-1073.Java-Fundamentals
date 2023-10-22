package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Andrii", "KN", 2,
                new Student.Grades[]{
                        new Student.Grades("Java", 5),
                        new Student.Grades("C++", 5),
                        new Student.Grades("Mathanalys", 5),
                }));
        studentList.add(new Student("Ivan", "KN", 2,
                new Student.Grades[]{
                        new Student.Grades("Java", 5),
                        new Student.Grades("C++", 4),
                        new Student.Grades("Mathanalys", 3),
                }));
        studentList.add(new Student("Petro", "KN", 1,
                new Student.Grades[]{
                        new Student.Grades("Java", 2),
                        new Student.Grades("C++", 1),
                        new Student.Grades("Mathanalys", 2),
                }));
        System.out.println("Student list before removing:");
        printAllStudents(studentList);
        removeStudentsWithBadGrades(studentList);

        System.out.println("\nStudent list after removing:");
        printAllStudents(studentList);

        printStudents(studentList, 3);
    }

    public static void removeStudentsWithBadGrades(List<Student> studentList) {
        var it = studentList.iterator();
        while (it.hasNext()) {
            Student temp = it.next();
            if (temp.getAvgGrade() >= 3) {
                temp.promoteToNextCourseLevel();
            } else {
                it.remove();
            }
        }
    }

    public static void printAllStudents(List<Student> studentList) {
        for (var student : studentList) {
            System.out.println(student);
        }
    }

    public static void printStudents(List<Student> studentList, int course) {
        if (studentList.isEmpty()) {
            System.out.println("No students in this list");
            return;
        }

        boolean found = false;
        for (var student : studentList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students in " + course + " course ");
        }
    }

}
