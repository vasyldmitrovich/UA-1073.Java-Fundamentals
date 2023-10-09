package com.softserve.edu06.pt.pt1;

public class ClassB extends ClassA {


    public double i = 1.1;

    @Override
    public void m1() {
        System.out.println("ClassB, method" +
                " m1, i=" + i);
// super.m1();
    }

    @Override
    public void m4() {
        System.out.println("ClassB, method" +
                " m4, i = " + i);
    }

    // @Override
    public void m5() {
        System.out.println("ClassB, method" +
                " m5");
    }

    // @Override
    public static void m6() {
        System.out.println("ClassB, static method" +
                " m6");
        ClassA.m6();
    }

    // private void m8() {
    @Override
    public void m8() {
        System.out.println("ClassB, method" +
                " m8");
        super.m8();
    }

}
