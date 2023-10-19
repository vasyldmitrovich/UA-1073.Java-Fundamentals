package com.softserve.edu06.pt;

public class Task1Edu06Pt {
    static class ClassA {
        public static final int I = 1;

        public ClassA() {
            System.out.println("ClassA() done");
        }

        public void m1() {
            System.out.println("ClassA, method m1, i=" + I);
        }

        public void m2() {
            System.out.println("ClassA, method m2, i=" + I);
        }

        public void m3() {
            System.out.print("ClassA, method m3, running m4(): ");
            m4();
        }

        public void m4() {
            System.out.println("ClassA, method m4");
        }

        public static void m6() {
            System.out.println("ClassA, static method m6");
        }

        protected void m8() {
            System.out.println("ClassA, method m8");
        }
    }

    static class ClassB extends ClassA {
        public static final double I = 1.1;

        @Override
        public void m1() {
            System.out.println("ClassB, method m1, i=" + I);
            super.m1();
        }

        @Override
        public void m4() {
            System.out.println("ClassB, method m4, i = " + I);
        }

        // @Override
        public void m5() {
            System.out.println("ClassB, method m5");
        }

        // @Override
        public static void m6() {
            System.out.println("ClassB, static method m6");
            ClassA.m6();
        }

        @Override
        public void m8() {
            System.out.println("ClassB, method m8");
            super.m8();
        }
    }


    public static class App {

        public static void main(String[] args) {


            System.out.println("Test_0 ClassB.");
            ClassB b0 = new ClassB();
            System.out.println("b0.i = " + b0.I);
            b0.m1();
            b0.m2();
            b0.m3();
            b0.m4();
            b0.m5();
            b0.m6();
            b0.m8();
        }
    }

}
