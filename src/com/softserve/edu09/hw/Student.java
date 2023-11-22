package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getGPA() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public boolean isPromoted() {
        return getGPA() >= 3;
    }
}

public class StudentManager {

    public static void removeStudentsWithLowGPA(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (!student.isPromoted()) {
                students.remove(i);
                i--;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Максим Коваль", "A", 1, List.of(90, 85, 92)));
        students.add(new Student("Олег Мельник", "B", 1, List.of(80, 75, 82)));
        students.add(new Student("Леон Гоффман", "C", 2, List.of(70, 65, 72)));
        students.add(new Student("Мері Сміт", "D", 2, List.of(60, 55, 62)));

        removeStudentsWithLowGPA(students);
        printStudents(students, 1);
    }
}