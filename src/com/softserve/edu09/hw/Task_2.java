package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "GroupA", 1, List.of(4, 3, 5)));
        students.add(new Student("Alice", "GroupB", 2, List.of(3, 3, 2)));
        students.add(new Student("Bob", "GroupA", 1, List.of(5, 4, 4)));
        students.add(new Student("Eve", "GroupB", 2, List.of(2, 3, 2)));

        for (var student: students){
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.calculateGPA() < 3) {
                iterator.remove();
            }else {
                student.promote();
            }
        }
        System.out.println("\nAfter processing:\n");
        for (Student student:students){
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }
    }

}

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

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public void promote() {
        if (calculateGPA() >= 3.0) {
            course++;
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}


