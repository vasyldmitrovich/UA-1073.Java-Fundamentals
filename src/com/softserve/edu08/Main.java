package com.softserve.edu08;

class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + "\nLast name: " + fullName.getLastName() + "\nAge: " + age;
    }

    public abstract String activity();
}

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Ivan", "Doroshenko");
        Person person = new ConcretePerson(fullName, 22);

        System.out.println(person.info());
        System.out.println("Activity: " + person.activity());
    }
}

class ConcretePerson extends Person {
    public ConcretePerson(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Working";
    }
}
