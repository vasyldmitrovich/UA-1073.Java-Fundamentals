package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff{
    private static final TypePerson TYPE_PERSON = TypePerson.CLEANER;

    public Cleaner(String name, double salary) {
        super(name, salary);
        printTypePerson(TYPE_PERSON);
    }

    @Override
    public String print() {
        return String.format("I am a %s. My name is %s. I work in an office.%n", TYPE_PERSON.typeName(), getName());
    }

    @Override
    public TypePerson getType() {
        return TYPE_PERSON;
    }

    @Override
    public String salary() {
        return String.format("Cleaner: %s. Salary: %.2f.%n", getName(), getSalary());
    }
}
