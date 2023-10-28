package com.softserve.edu08.hw.task1;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person (FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person (String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public FullName getFullName () {
        return fullName;
    }

    public void setFullName (FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String info () {
        return String.format("First name: %s, Last name: %s, Age: %d", fullName.getFirstName(), fullName.getLastName(), age);
    }

    public abstract String activity ();

    @Override
    protected Person clone () throws CloneNotSupportedException {
        Person cloneObject = (Person) super.clone();
        cloneObject.fullName = fullName.clone();

        return cloneObject;
    }
}
