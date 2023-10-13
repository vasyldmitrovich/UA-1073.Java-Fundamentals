package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {
    private double num1;
    private double num2;
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.getNumber();

    }


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }



    public double getTotal(){
        return num1 + num2;

    }

    public double getAverage(){
        return (num1 + num2) / 2;
    }

    public void getNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + getTotal());
        System.out.println("The average of " + num1 + " and " + num2 + " is " + getAverage());

    }
}

