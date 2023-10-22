package com.softserve.edu08.hw.task1;

class ConcretePerson extends Person {
    public ConcretePerson(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Programmer";
    }
}