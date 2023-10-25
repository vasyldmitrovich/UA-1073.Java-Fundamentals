package com.softserve.edu09.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = fill();
        removeLessThanThree(students);
        printStudents(students, 2);
    }
    public static List<Student> fill() {
        return new ArrayList<>(Arrays.asList(
                new Student("Anna", "IT-41", 1, new ArrayList<>(Arrays.asList(4.5, 3.7, 4.8, 5.0, 4.0))),
                new Student("Oleh", "CS-32", 1, new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0))),
                new Student("Iryna", "SE-11", 1, new ArrayList<>(Arrays.asList(4.0, 4.5, 4.6, 4.8, 5.0))),
                new Student("Taras", "M-21", 1, new ArrayList<>(Arrays.asList(3.0, 3.2, 3.3, 3.4, 3.5))),
                new Student("Olena", "SE-21", 1, new ArrayList<>(Arrays.asList(4.1, 3.9, 4.0, 4.3, 4.4)))));
    }
    public static void removeLessThanThree(List<Student> students) {
        var iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double sum = 0.0;
            for (Double grade : student.getGrades()) {
                sum += grade;
            }

            if (sum / student.getGrades().size() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

}
