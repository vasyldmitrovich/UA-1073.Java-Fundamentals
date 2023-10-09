package com.softserve.edu06.downloadfromsoftserve.castingobj;

class AClass {
    int field1 = 10;
}

class BClass extends AClass {
    int field2 = 20;

}

class TestAEqualsB {
    public static void main(String[] args) {
        AClass a = new AClass();
        BClass b = new BClass();
        a = b;
        System.out.println(b.field1);
        System.out.println(b.field2);
    }
}

class TestBEqualsA {
    public static void main(String[] args) {
        AClass a = new AClass();
        BClass b = new BClass();
        if (a instanceof BClass) {
            b = (BClass) a;
        }
        System.out.println(b.field1);
        System.out.println(b.field2);
    }
}