package com.softserve.edu07.pt.task2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PersonTest {
    static Person[] getPerson(){
        return new Person[]{
                new Teacher("John", 12500.0),
                new Cleaner("Alice", 10000.0),
                new Student("Bob"),
                new Cleaner("Lisa", 10450.0)
        };
    }

    static Staff[] getStaff(){
        return new Staff[]{
                new Teacher("John", 12500.0),
                new Cleaner("Alice", 10000.0),
                new Cleaner("Lisa", 10450.0)
        };
    }

    @ParameterizedTest
    @MethodSource("getPerson")
    void testPersonPrint(Person person){
        String start = String.format("I am a %s. My name is %s.", person.getType().typeName(), person.getName());
        assertTrue(person.print().startsWith(start));
    }

    @ParameterizedTest
    @MethodSource("getStaff")
    void testStaffSalary(Staff person){
        String start = String.format("%s: %s. Salary: %.2f.%n", person.getType().typeName(), person.getName(), person.getSalary());
        assertTrue(person.salary().startsWith(start));
    }
}
