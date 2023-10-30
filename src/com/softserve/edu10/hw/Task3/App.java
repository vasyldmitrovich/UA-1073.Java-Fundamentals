package com.softserve.edu10.hw.Task3;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Andriy", 3));
        students.add(new Student("Victoria", 2));
        students.add(new Student("Daria", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Nataliya", 2));

        System.out.println("\nList of students:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        Student.printStudents(students, 2);


        Student.sortByName(students);
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }


        Student.sortByCourse(students);
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }
    }
}

