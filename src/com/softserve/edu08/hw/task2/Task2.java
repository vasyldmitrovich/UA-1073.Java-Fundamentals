package com.softserve.edu08.hw.task2;

import com.softserve.edu08.hw.task1.FullName;

public class Task2 {
    public static void main (String[] args) {
        var student1 = new Student("John", "Doe", 19, 2);
        var student2 = new Student(new FullName("Helena", "Smith"), 18, 1);

        System.out.println(student1.info() + " " + student1.activity());
        System.out.println(student2.info() + " " + student2.activity());
        Student cloneStudent1 = null;

        try {
            cloneStudent1 = student1.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }


        cloneStudent1.setCourse(3);
        cloneStudent1.getFullName().setLastName("Doe 2");

        System.out.println(student1.info() + " " + student1.activity());
        System.out.println(student2.info() + " " + student2.activity());
        System.out.println(cloneStudent1.info() + " " + cloneStudent1.activity());
    }
}
