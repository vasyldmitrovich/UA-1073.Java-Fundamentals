package com.softserve.edu08.hw;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = new Student[3];
        students[0] = new Student(new FullName("Bob", "Marley"), 20, 3);
        students[1] = new Student("Alice", "Cooper", 19, 2);
        printAllStudents(students, 2);
        System.out.println("Cloning the first student ...");
        students[2] = (Student) students[0].clone();
        printAllStudents(students, 3);
        System.out.println("Change course number for last student ...");
        students[2].setCourse(5);
        printAllStudents(students, 3);
    }

    public static void printAllStudents(Student[] students, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + students[i].info() + " Activity: " + students[i].activity());
        }
    }
}
