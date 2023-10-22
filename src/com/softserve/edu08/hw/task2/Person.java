package com.softserve.edu08.hw.task2;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return "Name: " + name + ", Age: " + age;
    }

    public String activity() {
        return "I am a person";
    }
}