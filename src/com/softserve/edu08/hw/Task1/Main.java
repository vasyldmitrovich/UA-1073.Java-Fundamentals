package com.softserve.edu08.hw.Task1;

public class Main{
    public static void main(String[] args) {
    Student st1 = new Student(new Person.FullName("Anna", "Smith"), 25, 1);
            st1.info();
        System.out.println(st1.activity());
        Student st2 = new Student(new Person.FullName("Bob", "Gilmor"), 30, 2);
        st2.info();
        System.out.println(st2.activity());
        Student st3 = st1.clone();
        st3.info();
        System.out.println(st3.activity());
        st3.course = 10;
        st1.info();
        System.out.println(st1.activity());
        st2.info();
        System.out.println(st2.activity());
        st3.info();
        System.out.println(st3.activity());
    }
}
