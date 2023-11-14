package com.softserve.edu08.hw.Task1;

import com.softserve.edu08.hw.Task1.Person;
import com.softserve.edu08.hw.Task1.Student;

public class App {
    public static void main(String[] args) {
        FullName fullName = new FullName("John", "Doe");
        Person person = new Student(fullName, 20, "Example University");

        System.out.println(person.info());
        System.out.println(person.activity());
    }
}

