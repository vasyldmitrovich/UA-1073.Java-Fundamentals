package com.softserve.edu08.hw.Task1;


abstract class Person {
    protected FullName fullName;
    protected int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    public abstract String activity();
}


class Student extends Person {
    private String school;

    public Student(FullName fullName, int age, String school) {
        super(fullName, age);
        this.school = school;
    }

    @Override
    public String activity() {
        return "Student at " + school;
    }
}



