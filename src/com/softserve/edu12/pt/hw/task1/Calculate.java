package com.softserve.edu12.pt.hw.task1;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            double num1 = Double.parseDouble(scan.nextLine());
            System.out.println("Enter second number:");
            double num2 = Double.parseDouble(scan.nextLine());

            double result = div(num1, num2);
            System.out.println("Division result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter the numbers in the format '1.1'. Please note (" + e.getMessage() + ")");
        }catch (ArithmeticException e){
            System.out.println("Oops..Division by zero is not allowed");
        }catch (Exception e ){
            System.out.println("There was a failure " + e.getMessage());
        }
        finally {
            scan.close();
        }

    }
    public static double div(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return n1 / n2;
    }
}
