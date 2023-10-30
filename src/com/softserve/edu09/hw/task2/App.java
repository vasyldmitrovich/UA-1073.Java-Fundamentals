package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Oleksiy", "KN", 3, List.of(3.1, 2.9, 3.5)));
        studentList.add(new Student("Anton", "PR", 3, List.of(2.9, 2.8, 2.7)));
        studentList.add(new Student("Bogdan", "KN", 2, List.of(3.9, 4.0, 3.8)));
        studentList.add(new Student("Dima", "IBK", 1, List.of(2.2, 2.5, 2.8)));
        studentList.add(new Student("Andriy", "KN", 4, List.of(4.5, 4.3, 4.7)));
        System.out.println("Students");
        System.out.println(studentList);
        studentList.removeIf(student -> student.calculateAverageMark() < 3.0);
        studentList.forEach(Student::promoteToNextCourse);

        System.out.println("next course students");
        System.out.println(studentList);

        var scanner = new Scanner(System.in);
        System.out.println("Input course of student");
        int course = scanner.nextInt();
        Student.printStudents(studentList, course);
    }
}
