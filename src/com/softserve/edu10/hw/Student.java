package com.softserve.edu10.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void printStudent() {
        System.out.println("Ім'я: " + name + ", Курс: " + course);
    }

    public boolean compareByName(Student otherStudent) {
        return this.name.compareToIgnoreCase(otherStudent.name) < 0;
    }

    public boolean compareByCourse(Student otherStudent) {
        return this.course < otherStudent.course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                student.printStudent();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Антон", 2));
        students.add(new Student("Боб", 1));
        students.add(new Student("Вадентин", 3));
        students.add(new Student("Дарина", 1));
        students.add(new Student("Габріель", 2));

        System.out.println("справжній лист:");
        for (Student student : students) {
            student.printStudent();
        }

        System.out.println("\nСортовано по імені:");
        students.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        for (Student student : students) {
            student.printStudent();
        }

        System.out.println("\nСортовано по курсу:");
        students.sort((o1, o2) -> o1.getCourse() - o2.getCourse());
        for (Student student : students) {
            student.printStudent();
        }
    }
}