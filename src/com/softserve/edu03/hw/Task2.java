/*Write Java console application with method to find the smallest number among three integer numbers.*/

package com.softserve.edu03.hw;

import java .util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type Number 1 : ");
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        int smallest = findSmallest(first, second, third);
        System.out.println("The smallest number among " + first + ", " + second + ", and " + third + " is: " + smallest);

    }
    public static int findSmallest(int first, int second, int third){
        int smallest = first;
        if(second < smallest){
            smallest = second;
        }
        if(third < smallest){
            smallest = third;
        }
        return smallest;
    }
}
