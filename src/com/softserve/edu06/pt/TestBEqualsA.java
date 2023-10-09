package com.softserve.edu06.pt;

public class TestBEqualsA {
    public static void main(String[] args) {
        Aclass a = new Aclass();
        Bclass b = new Bclass();
        if (a instanceof Bclass) {
            b = (Bclass) a;
        }
        System.out.println(b.field1);
        System.out.println(b.field2);
    }
}
