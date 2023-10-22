package com.softserve.edu09.hw.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {//DO NOT WRITE LINE BY LINE it is hard to write
        List<Student> students = new ArrayList<>();
        List<Subject> subjects = new ArrayList<>();

        subjects.add(new Subject("Mathematics", 5));
        subjects.add(new Subject("Physics", 3));
        subjects.add(new Subject("Informatics",4));
        students.add(new Student("Anna", "Data science", 1, subjects));
        subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", 5));
        subjects.add(new Subject("Physics", 3));
        subjects.add(new Subject("Informatics",4));
        students.add(new Student("Daniel", "Data science", 2, subjects));
        subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", 5));
        subjects.add(new Subject("Physics", 3));
        subjects.add(new Subject("Informatics",4));
        students.add(new Student("Helen", "Data science", 3, subjects));
        subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", 4));
        subjects.add(new Subject("History",1));
        subjects.add(new Subject("English",2));
        subjects.add(new Subject("French",3));
        students.add(new Student("John", "Plilology", 1, subjects));
        subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", 4));
        subjects.add(new Subject("History",3));
        subjects.add(new Subject("English",2));
        subjects.add(new Subject("French",4));
        students.add(new Student("Jill", "Plilology", 2, subjects));
        subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", 3));
        subjects.add(new Subject("Physics", 4));
        subjects.add(new Subject("Geography",3));
        subjects.add(new Subject("Biology",4));
        students.add(new Student("Ben", "Mining and drilling", 2, subjects));
        subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", 1));
        subjects.add(new Subject("Physics", 4));
        subjects.add(new Subject("Geography",3));
        subjects.add(new Subject("Biology",4));
        students.add(new Student("Sarah", "Mining and drilling", 2, subjects));
        subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", 2));
        subjects.add(new Subject("Physics", 3));
        subjects.add(new Subject("Geography",3));
        subjects.add(new Subject("Biology",2));
        students.add(new Student("Jimmy", "Mining and drilling", 1, subjects));
        System.out.println("Base list of students:");
        printStudents(students);
        System.out.println("Removing students and enrolling students to the next course:");
        removeAndEnrollStudents(students);
        printStudents(students);
        var console = new Scanner(System.in);
        System.out.println("Enter course number:");
        int courseNumber = console.nextInt();
        printStudents(students, courseNumber);
    }

    static void printStudents(List<Student> collection) {
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(i + ": " + collection.get(i).info());
        }
    }

    static void printStudents(List<Student> collection, int course) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getCourse() == course) {
                System.out.println(i + ": " + collection.get(i).info());
            }
        }
    }

    static void removeAndEnrollStudents(List<Student> collection) {
        var it = collection.iterator();
        while (it.hasNext()) {
            Student el = it.next();
            if (el.getAverageGrade() < 3) {
                it.remove();
            } else {
                el.setCourse(el.getCourse() + 1);
            }
        }
    }
}
