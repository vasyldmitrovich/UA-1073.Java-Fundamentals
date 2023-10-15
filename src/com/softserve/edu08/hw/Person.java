package com.softserve.edu08.hw;

abstract class Person{
    private FullName fullName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setFirstName(String firstName) {
        fullName.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        fullName.setLastName(lastName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return fullName.toString() + ", Age: " + getAge();
    }

    abstract String activity();
}
