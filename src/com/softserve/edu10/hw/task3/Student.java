package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student (String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents (ArrayList<Student> list, int course) {
        List<Student> filteredList = new ArrayList<>();

        for (Student student : list) {
            if (student.getCourse() == course) {
                filteredList.add(student);
            }
        }

        Iterator<Student> iterator = filteredList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getCourse () {
        return course;
    }

    public void setCourse (int course) {
        this.course = course;
    }

    public int compareByCourse (Student student) {
        return course - student.getCourse();
    }

    public int compareByName (Student student) {
        return name.compareTo(student.getName());
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
