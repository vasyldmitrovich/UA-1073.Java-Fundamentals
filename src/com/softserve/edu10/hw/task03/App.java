package com.softserve.edu10.hw.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        populateStudents(students);
        Student.printStudents(students, 0);
        Student.printStudents(students, promptCoure());
        System.out.println("\nAll list sorted by name:");
        Collections.sort(students, Student.compareByName());
        Student.printStudents(students, 0);
        System.out.println("\nAll list sorted by course:");
        Collections.sort(students, Student.compareByCourse());
        Student.printStudents(students, 0);
    }

    public static void populateStudents(List<Student> students) {
        students.add(new Student("Boyko Volodymyr", 3));
        students.add(new Student("Kozak Olena", 2));
        students.add(new Student("Tokar Petro", 1));
        students.add(new Student("Bondar Maria", 1));
        students.add(new Student("Savchuk Oleksii", 2));
    }

    public static int promptCoure() {
        System.out.print("\nEnter course number: ");
        int course = SCANNER.nextInt();
        SCANNER.nextLine();
        return course;
    }
}
