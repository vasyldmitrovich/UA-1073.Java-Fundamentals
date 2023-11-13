package com.softserve.edu08;

abstract class Personn {
    abstract void info();

    void activity() {
    }
}

class Student extends Personn {
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    @Override
    void activity() {
        System.out.println("I study at university");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan Doroshenko", 18, 1);
        Student student2 = new Student("James Bond", 19, 2);

        student1.info();
        student1.activity();

        System.out.println();

        student2.info();
        student2.activity();
    }
}
