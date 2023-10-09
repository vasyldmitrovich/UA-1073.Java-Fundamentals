package com.softserve.edu06.pt;

public class Child extends Parent {

    public int f() {
        System.out.println("running f() from Child");
        return 2;
    }

    public int useF2() {
        return useF();
    }
}
