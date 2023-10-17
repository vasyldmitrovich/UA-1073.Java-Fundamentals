package com.softserve.edu08.hw.Task2;

import com.softserve.edu08.hw.Task1.FullName;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = new Student[]{
                new Student(new FullName("Mike", "Ramoson"), 18, 1),
                new Student(new FullName("Maria", "Kovalska"), 23, 7)
        };

        for (Student st : students) {
            studentInfo(st);
        }

        Student student1Clone = (Student) students[0].clone();
        student1Clone.setCourse(3);

        studentInfo(student1Clone);
    }

    private static void studentInfo(Student st) {
        System.out.println(st.info());
        System.out.println(st.activity());
    }

}
