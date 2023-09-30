package com.softserve.edu03.pt.Task2;

import java.util.Scanner;

public class Main {
Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
      Employee em1 = new Employee();
        em1.setName("Ana");
        em1.setRage(50);
        em1.setHours(10);
        em1.informations();

        Employee em2 = new Employee();
        em2.setName("Bob");
        em2.setRage(100);
        em2.setHours(20);
        em2.informations();

        Employee em3 = new Employee();
        em3.setName("Marta");
        em3.setRage(40);
        em3.setHours(40);
        em3.informations();
        System.out.println("Total sum for all employee is " +  Employee.getTotalSum());
    }
    }
