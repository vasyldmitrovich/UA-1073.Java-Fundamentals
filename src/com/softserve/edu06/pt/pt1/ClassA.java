package com.softserve.edu06.pt.pt1;

class ClassA {

    public int i = 1;

    public ClassA() {
        System.out.println("ClassA() done");
    }

    public void m1() {
        System.out.println("ClassA, method" +
                " m1, i=" + i);
    }

    public void m2() {
        System.out.println("ClassA, method" +
                " m2, i=" + i);
    }

    public void m3() {
        System.out.print("ClassA, method" +
                " m3, running m4(): ");
        m4();
    }

    public void m4() {
        System.out.println("ClassA, method" +
                " m4");
    }

    public static void m6() {
        System.out.println("ClassA, static method" +
                " m6");
    }

    protected void m8() {
        System.out.println("ClassA, method" +
                " m8");
    }

}
