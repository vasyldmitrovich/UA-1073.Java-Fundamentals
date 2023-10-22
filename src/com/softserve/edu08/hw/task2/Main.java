package com.softserve.edu08.hw.task2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "Computer Science");
        Student student2 = new Student("Bob", 22, "Mathematics");

        System.out.println("Student 1 Info: " + student1.info());
        System.out.println("Student 1 Activity: " + student1.activity());
        System.out.println("Student 2 Info: " + student2.info());
        System.out.println("Student 2 Activity: " + student2.activity());

        Student student3 = student1.cloneStudent("Physics");

        System.out.println("\nCloned Student 3 Info: " + student3.info());

        System.out.println("\nAll Students Info:");
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());
    }
}