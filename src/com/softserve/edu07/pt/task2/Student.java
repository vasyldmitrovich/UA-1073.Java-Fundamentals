package com.softserve.edu07.pt.task2;

public class Student extends Person{
    private static final TypePerson TYPE_PERSON = TypePerson.STUDENT;

    public Student(String name) {
        super(name);
        printTypePerson(TYPE_PERSON);
    }

    @Override
    public String print() {
        return String.format("I am a %s. My name is %s.%n", TYPE_PERSON.typeName(), getName());
    }

    @Override
    public TypePerson getType() {
        return TYPE_PERSON;
    }
}
