package com.softserve.edu08.task1;

public class App {//All is very good
    public static void main(String[] args) throws CloneNotSupportedException {
        Student firstStudent = new Student(new FullName("Nick", "Johns"), 20, 2);
        Student secondStudent = new Student(new FullName("John", "Doe"), 21, 3);

        System.out.println(firstStudent.activity());
        System.out.println(firstStudent.info());

        System.out.println(secondStudent.activity());
        System.out.println(secondStudent.info());


        Student copy = firstStudent.clone();

        System.out.println(copy.activity());
        System.out.println(copy.info());

    }
}
