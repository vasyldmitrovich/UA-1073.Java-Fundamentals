package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(createStudent());
        }

        list.sort(Student::compareByName);
        System.out.println(list);

        list.sort(Student::compareByCourse);
        System.out.println(list);
    }

    public static Student createStudent () {
        System.out.println("Enter name");
        String name = SCANNER.nextLine();
        System.out.println("Enter course");
        int course = SCANNER.nextInt();
        SCANNER.nextLine();

        return new Student(name, course);
    }
}
