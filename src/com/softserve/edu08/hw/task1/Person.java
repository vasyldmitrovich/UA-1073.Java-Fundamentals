package com.softserve.edu08.hw.task1;

public abstract class Person {
    private final FullName fullName;
    private final int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    public abstract String activity();

    public static void main(String[] args) {
        FullName personName = new FullName("John", "Doe");
        Person person = new ConcretePerson(personName, 30);

        System.out.println(person.info());

        String activity = person.activity();
        System.out.println("Activity: " + activity);
    }
}