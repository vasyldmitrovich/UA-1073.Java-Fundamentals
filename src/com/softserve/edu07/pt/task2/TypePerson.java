package com.softserve.edu07.pt.task2;

public enum TypePerson {
    STUDENT("Student"),
    TEACHER("Teacher"),
    CLEANER("Cleaner");

    private final String type;

    TypePerson(String type){
        this.type = type;
    }

    public String typeName() {
        return type;
    }
}