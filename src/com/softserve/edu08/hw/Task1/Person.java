package com.softserve.edu08.hw.Task1;

public abstract class Person implements Cloneable {
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
        return "First Name: '" + this.fullName.getFirstName() +
                "', Last Name: '" + this.fullName.getLastName() + "', age: " +
                age;
    }

    public abstract String activity();

    public Object clone() throws CloneNotSupportedException {//Not good
        Person clonedPerson = (Person) super.clone();
        FullName clonedFullName = new FullName(this.fullName.getFirstName(), this.fullName.getLastName());
        clonedPerson.fullName = clonedFullName;

        return clonedPerson;
    }
}
