package com.softserve.edu08.hw.task2;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student(3);
        Student student2 = new Student(2);
        Student student3 = (Student) student1.clone();

        System.out.println(student1.activity());
        System.out.println(student1.info());
        System.out.println(student2.activity());
        System.out.println(student2.info());
        System.out.println(student3.activity());
        System.out.println(student3.info());
        student2.setCourse(1);
        System.out.println(student1.activity());
        System.out.println(student1.info());
        System.out.println(student2.activity());
        System.out.println(student2.info());
        System.out.println(student3.activity());
        System.out.println(student3.info());
    }
}
