package com.softserve.edu06.pt.pt1;

public class AppInside {

    public static void main(String[] args) {


        System.out.println("Test ClassA.");
        ClassA a;
        a = new ClassA();
        System.out.println("a.i = " + a.i);
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        ClassA.m6(); // static running A.m6(); Vovkotrub_Petro - fix it because method is static
        a.m8();

        System.out.println("Test ClassB.");
        ClassA b = new ClassB();
        System.out.println("b.i = " + b.i);
        b.m1();
        b.m2();
        b.m3();
        b.m4();
//        b.m5();
        ((ClassB) b).m5(); // Vovkotrub_Petro - fix upper architecture error.
        if (b instanceof ClassB) {
            ((ClassB) b).m5(); // No Runtime Error
        }
//        b.m6(); // Running from ClassA; Architecture Error;
        ClassB.m6(); // Vovkotrub_Petro - fix upper architecture error.
        ClassB.m6();
        ClassA.m6();
        b.m8();

        System.out.println("Test_0 ClassB.");
        ClassB b0 = new ClassB();
        System.out.println("b0.i = " + b0.i);
        b0.m1();
        b0.m2();
        b0.m3();
        b0.m4();
        b0.m5();
        ClassB.m6(); // Vovkotrub_Petro - fix
        b0.m8();
    }
}
