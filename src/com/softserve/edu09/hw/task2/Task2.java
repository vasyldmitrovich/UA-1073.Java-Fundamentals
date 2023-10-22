package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {//Ok
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            students.add(createStudent());
        }

        System.out.println(students);

        checkStudentsGrading(students);
        System.out.println(students);

        printStudents(students, 3);
    }

    public static void printStudents(List<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            var student = students.get(i);
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void checkStudentsGrading(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            var student = students.get(i);
            double avgGrade = student.getAverageGrade();
            if (avgGrade < 3) {
                students.remove(i);
            } else {
                int course = student.getCourse();
                student.setCourse(course + 1);
            }
        }
    }

    public static Student createStudent() {
        var student = new Student();

        System.out.println("Enter student name");
        student.setName(SCANNER.nextLine());

        System.out.println("Enter student group");
        student.setGroup(SCANNER.nextLine());

        System.out.println("Enter student course");
        student.setCourse(SCANNER.nextInt());
        SCANNER.nextLine();

        System.out.println("How many subjects does the student attend?");
        int subjectAmount = SCANNER.nextInt();
        SCANNER.nextLine();

        List<Subject> subjects = new ArrayList<>();

        for (int i = 0; i < subjectAmount; i++) {
            Subject newSub = createSubject();
            subjects.add(newSub);
        }

        student.setGrades(subjects);

        return student;
    }

    public static Subject createSubject() {
        System.out.println("Enter subject name");

        String subjectName = SCANNER.nextLine();
        System.out.println("Enter subject grade");

        int grade = SCANNER.nextInt();
        SCANNER.nextLine();

        var subject = new Subject(subjectName, grade);

        return subject;
    }
}
