package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3,"Oleksiy"));
        students.add(new Student(4,"Anton"));
        students.add(new Student(2,"Vladik"));
        students.add(new Student(1,"Bogan"));

        for (Student student : students){
            System.out.println(student.getName() + " course " + student.getCourse());
        }
        System.out.println("=========================");

        System.out.println("Input course which student want to see ");
        var scanner = new Scanner(System.in);
        int courseWantToSee = scanner.nextInt();
        Student.printStudent(students,courseWantToSee);
        System.out.println("=========================");

        System.out.println("Sorted by name");
        Student.sortedByName(students);
        for (Student student : students){
            System.out.println(student.getName() + " course " + student.getCourse());
        }
        System.out.println("=========================");

        System.out.println("Sorted by course");
        Student.sortedByCourse(students);
        for (Student student : students){
            System.out.println(student.getName() + " course " + student.getCourse());
        }
        System.out.println("=========================");

        Student.studentCompare(students);
    }
}
