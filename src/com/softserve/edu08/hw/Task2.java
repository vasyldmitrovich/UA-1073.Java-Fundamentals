package com.softserve.edu08.hw;

public class Task2 {

    public static void main(String[] args) {


        FullName fullName1 = new FullName("Андрій", "Володимирович");


        Student student1 = new Student(fullName1, 18, 1);


        System.out.println(student1.info());
        System.out.println(student1.activity());

        FullName FullName2 = new FullName("Олеся", "Михайлівна");

        FullName fullName2 = null;
        Student student2 = new Student(fullName2, 21, 4);

        System.out.println(student2.info());
        System.out.println(student2.activity());

        
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());
    }
}
