package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int courseNum = 3;

        List<Student> students = createStudents();

        print(students);
        Student.printStudents(students, courseNum);
        sort(students);
    }

    private static List<Student> createStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Lucas", 5));
        students.add(new Student("Olivia", 3));
        students.add(new Student("Ethan", 2));
        students.add(new Student("Chloe", 3));
        students.add(new Student("Aria", 2));

        return students;
    }

    private static void print(List<Student> students){
        System.out.println("Students info");
        for(var student : students){
            System.out.printf("\tName: %s, Course: %d.%n", student.getName(), student.getCourseNum());
        }
        System.out.println();
    }

    private static void sort(List<Student> students){
        System.out.println("Sorted list by name in ascending order");
        students.sort(Comparator.comparing(Student::getName));
        print(students);

        System.out.println("Sorted list by name in descending order");
        students.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));
        print(students);

        System.out.println("Sorted list by exchange rate in ascending order");
        students.sort(Comparator.comparingInt(Student::getCourseNum));
        print(students);

        System.out.println("Sorted list by exchange rate in descending order");
        students.sort((s1, s2) -> Integer.compare(s2.getCourseNum(), s1.getCourseNum()));
        print(students);
    }
}
