package com.softserve.edu10.hw;

import java.util.*;

public class Student implements Comparable<Student> {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 3));
        students.add(new Student("Mark", 2));
        students.add(new Student("Ann", 3));
        students.add(new Student("Maks", 1));
        students.add(new Student("Maks", 2));

        System.out.println("List of students sorted by name: ");
        Collections.sort(students);
        for (Student student: students){
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        System.out.println("List of students sorted by course:" );
        students.sort(Student.compareByCourse);
        for (Student student:students){
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        int targetCourse = 2;
        Student.printStudents(students, targetCourse);
    }
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

    public static void printStudents(List<Student> students, int targetCourse){
        System.out.println("Students on the course " + targetCourse + ":" );
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getCourse()== targetCourse){
                System.out.println(student.getName());
            }
        }
    }

    public int compareTo(Student other){
        return this.name.compareTo(other.getName());
    }

    public static Comparator<Student> compareByCourse = Comparator.comparingInt(Student::getCourse);



}
