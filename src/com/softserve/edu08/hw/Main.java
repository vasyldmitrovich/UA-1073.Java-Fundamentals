package com.softserve.edu08.hw;

import com.softserve.edu08.hw.task1.Person;
import com.softserve.edu08.hw.task2.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(new Person.FullName("Bohdan", "Mysko"), 20, 4);
        Person person = student.clone();

        person.setFullName(new Person.FullName("Ivan", "Ivanov"));

        System.out.println(student.info());
        System.out.println(person.info());
        System.out.println(student.activity());
        System.out.println(person.activity());
    }
}
