package com.softserve.edu03.pt.pt.Task2;

import java.util.Scanner;
// do not understand why I cannot count salary with bonus added... and total sum is not correct because of this reason
public class Employee {
    private String name;
    private double rate;
    private double hours;
    static double totalSum;


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        emp1.setName(name);
        System.out.println("Enter rate: ");
        Double rate = sc.nextDouble();
        emp1.setRate(rate);
        System.out.println("Enter hours: ");
        Double hours = sc.nextDouble();
        sc.nextLine();
        emp1.setHours(hours);

        Employee emp2 = new Employee();
        System.out.println("Enter name: ");
        String name2 = sc.nextLine();
        emp2.setName(name);
        System.out.println("Enter rate: ");
        Double rate2 = sc.nextDouble();
        emp2.setRate(rate);
        System.out.println("Enter hours: ");
        Double hours2 = sc.nextDouble();
        sc.nextLine();
        emp2.setHours(hours);

        Employee emp3 = new Employee();
        System.out.println("Enter name: ");
        String name3 = sc.nextLine();
        emp3.setName(name);
        System.out.println("Enter rate: ");
        Double rate3 = sc.nextDouble();
        emp3.setRate(rate);
        System.out.println("Enter hours: ");
        Double hours3 = sc.nextDouble();
        emp3.setHours(hours);

        System.out.println(totalSum);


    }
    public Employee() {

    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += rate * hours;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        totalSum += (rate - this.rate) * hours;
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum += (hours - this.hours) * rate;
        this.hours = hours;
    }

    public double getSalary(){
        return (rate * hours) + getGetBounuses();
    }

    public double getGetBounuses(){
        return 0.1 / (rate * hours);

    }


}

