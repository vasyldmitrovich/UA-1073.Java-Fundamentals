package com.softserve.edu08.hw;

public class Task1_2 {
    public static void task1_2() {
        Student student1 = new Student(new FullName("Berchak", "Andrii"), 19, 2);
        Student student2 = new Student(new FullName("John", "Doe"), 25, 6);
        printStudents(student1, student2);
        System.out.println("+=".repeat(29));

        Student cloneStudent = student1.clone();
        printStudents(student1, cloneStudent);

        System.out.println("+=".repeat(29));
        cloneStudent.setAge(20);
        cloneStudent.setCourse(3);

        printStudents(student1, cloneStudent);
    }

    public static void printStudents(Student... students) {
        for (var student : students) {
            System.out.println(student.info());
            System.out.println(student.activity() + "\n");
        }

    }

}
