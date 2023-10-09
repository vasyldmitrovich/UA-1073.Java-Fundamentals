package com.softserve.edu06.pt;

public class Parent {

    int f() {
        System.out.println("running f() from Parent");
        return 1;
    }

    public int useF() {
        return f();
    }
}

