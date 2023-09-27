package com.softserve.edu03.pt;

import java.util.Locale;
import java.util.Scanner;

public class Java1 {
    static public final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Student.printStudentStats();

        Student student1 = new Student();
        Student.promptParameters(student1);
        Student.printStudentStats();

        Student student2 = new Student();
        Student.promptParameters(student2);
        Student.printStudentStats();

        Student student3 = new Student();
        Student.promptParameters(student3);
        Student.printStudentStats();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}
