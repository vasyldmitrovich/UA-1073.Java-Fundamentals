package com.softserve.edu08.hw.task1;

public class Task_1_and_2_Edu08Hw {

    public static void main(String[] args) {

        Student student1 = new Student(new FullName("Artur", "Arsen"), 30, 4);
        Student student2 = new Student(new FullName("Ros", "Galler"), 35, 3);
        Student student3 = new Student(new FullName("Boni", "Pug"), 22, 2);

        System.out.println(student1.activity());
        System.out.println(student1.info());
        System.out.println();

        System.out.println(student2.activity());
        System.out.println(student2.info());
        System.out.println();

        System.out.println(student3.activity());
        System.out.println(student3.info());
        System.out.println();


    }
}
