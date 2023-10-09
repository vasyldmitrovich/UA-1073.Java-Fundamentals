package edu03;

import java.util.Scanner;
public class hw33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Вкажіть три числа ");
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int smallest = smallestt(num, num1, num2);
        System.out.println(" Найменше число - " + smallest);//Call this method here
    }
    public static int smallestt(int num, int num1, int num2) {
        int smallest = num;
        if (num1 < smallest) {
            smallest = num1;
        }
        if (num2 < smallest) {
            smallest = num2;
        }
        return smallest;
    }
}

