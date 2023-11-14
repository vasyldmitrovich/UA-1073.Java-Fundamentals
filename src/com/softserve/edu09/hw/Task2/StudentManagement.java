package com.softserve.edu09.hw.Task2;

import java.util.Iterator;
import java.util.List;

    public class StudentManagement {
        public static void removeUnderperformingStudents(List<Student> students) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getAverageGrade() < 3.0) {
                    iterator.remove();
                } else {
                    student.promoteStudent();
                }
            }
        }

        public static void printStudents(List<Student> students, int course) {
            System.out.println("Students enrolled in course " + course + ":");
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }
