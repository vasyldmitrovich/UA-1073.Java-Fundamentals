package com.softserve.edu10.hw.task3;

import java.util.List;

public class Student {
    private final String name;
    private final int courseNum;

    public static void printStudents(List<Student> students, int courseNum){
        System.out.printf("In course %d you will learn%n", courseNum);
        for (Student student : students) {
            if (student.courseNum == courseNum) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public Student(String name, int courseNum) {
        this.name = name;
        this.courseNum = courseNum;
    }

    public String getName() {
        return name;
    }

    public int getCourseNum() {
        return courseNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseNum=" + courseNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (courseNum != student.courseNum) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + courseNum;
        return result;
    }
}
