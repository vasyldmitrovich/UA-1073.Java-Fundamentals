package com.softserve.edu06.pt.task1;

import com.softserve.edu06.pt.task1.ClassA;

class ClassB extends ClassA {
    public double i = 1.1;

    @Override
    public void m1() {
        System.out.println("ClassB, method m1, i=" + i);
    }

    @Override
    public void m4() {
        System.out.println("ClassB, method m4, i = " + i);
    }

    public void m5() {
        System.out.println("ClassB, method m5");
    }


    public static void m6() {
        System.out.println("ClassB, static method m6");
        ClassA.m6();
    }

    protected void m8() {
        System.out.println("ClassB, method m8");
        super.m8();
    }

    public static void main(String[] args) {
        System.out.println("Test_0 ClassB.");
        ClassB b0 = new ClassB();
        System.out.println("b0.i = " + b0.i);
        b0.m1();
        b0.m2();
        b0.m3();
        b0.m4();
        b0.m5();
        b0.m6();
        b0.m8();
    }
}
