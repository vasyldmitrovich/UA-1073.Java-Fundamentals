package com.softserve.edu10.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

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

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse());
    }

    @Override
    public String toString() {
        return "(" + name + ", " + course + ")";
    }

    public static void printStudents(List<Student> list, int course) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            var student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }


    static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CourseComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getCourse(), o2.getCourse());
        }
    }
}
