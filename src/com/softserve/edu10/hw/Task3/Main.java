package com.softserve.edu10.hw.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list1= new ArrayList<>();
        list1.add(new Student("Bob", 1));
        list1.add(new Student("Alex", 2));
        list1.add(new Student("Mia", 1));
        list1.add(new Student("Alice", 2));
        list1.add(new Student("Mark", 1));
        int courseNumber=Student.promptCourseNumber();
        Student.printStudents(list1, courseNumber);
        Student.compareByName(list1);
        Student.compareByCourse(list1);
        Student.sortName(list1);
        System.out.println("-".repeat(20));
        Student.sortCourse(list1);
    }
}
