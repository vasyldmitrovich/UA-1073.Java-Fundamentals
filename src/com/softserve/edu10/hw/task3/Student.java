package com.softserve.edu10.hw.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    private int course;
    private String name;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printStudent(List<Student> students, int targetCoutse){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getCourse() == targetCoutse){
                System.out.println(student.getName());
            }
        }
    }
    public static void studentCompare (List<Student> students){
        Student studentWithMaxCourse = students.get(0);
        for (Student student : students){
            if (student.getCourse() > studentWithMaxCourse.getCourse()){
                studentWithMaxCourse = student;
            }
        }
        System.out.println("Oldest student: "+ "name "+ studentWithMaxCourse.getName()+ " course " + studentWithMaxCourse.getCourse());
    }
    public static void sortedByName(List<Student> students){
        students.sort(Comparator.comparing(Student :: getName));
    }

    public static void sortedByCourse(List<Student> students){
        students.sort(Comparator.comparing(Student :: getCourse));
    }
}
