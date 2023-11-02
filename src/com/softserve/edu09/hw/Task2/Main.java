package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anna", 1, 1, 3,5,4));
        studentList.add(new Student("Bob", 1, 1, 3,2,2));
        studentList.add(new Student("Alex", 1, 2, 2,5,5));
        studentList.add(new Student("Mery", 1, 2, 3,5,5));
        studentList.add(new Student("Mark", 1, 1, 5,5,5));
        studentList.add(new Student("Elice", 1, 2, 1,4,2));

        Student.onNextCourseList(studentList);
        Student.printStudents(studentList, Student.askForCourseNumber());

    }
}
