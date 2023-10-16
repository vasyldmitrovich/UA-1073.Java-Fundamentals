package com.softserve.edu04.pt;
import java.util.Arrays;
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x("Enter the first number:");
        int x = scanner.nextInt();
        x("Enter the second number:");
        int y = scanner.nextInt();
        x("Enter the third number:");
        int i = scanner.nextInt();
        int[] result = new int[] {x,y,i};
        System.out.println("U've been writing the: " + Arrays.toString(result));
        int q = x%2;
        int w = y%2;
        int c = i%2;
        if (q == 1 || w == 1) {
            System.out.println("You have an odd number in list");
        }else if (c == 1){
            System.out.println("You have an odd number in list");
        }else {
            System.out.println("List doesn't have the odd numbers");
        }
        scanner.close();
    }

    public static String x(String x) {
        System.out.println(x);
        return null;
    }
}
