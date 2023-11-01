package com.softserve.edu08.hw.task1;

abstract class Person {
    private FullName fullName;
    private int age;

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }

    public String info() {
        return "first name: " + fullName.getFirstName() + "Last name: " + fullName.getLastName() + "age: " + age;
    }

    public abstract String activity();
}

