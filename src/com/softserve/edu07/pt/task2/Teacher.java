package com.softserve.edu07.pt.task2;

public class Teacher extends Staff{
    private static final TypePerson TYPE_PERSON = TypePerson.TEACHER;

    public Teacher(String name, double salary) {
        super(name, salary);
        printTypePerson(TYPE_PERSON);
    }

    @Override
    public String print() {
        return String.format("I am a %s. My name is %s. I work at a school.%n", TYPE_PERSON.typeName(), getName());
    }

    @Override
    public TypePerson getType() {
        return TYPE_PERSON;
    }

    @Override
    public String salary() {
        return String.format("Teacher: %s. Salary: %.2f.%n", getName(), getSalary());
    }
}