package com.softserve.edu12.hw;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

class HWTwo {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static int start;
    static int end;

    static int readNumber(int start, int end) {
        System.out.println("Input number and i'll check if it's in range [" + start +
                ", " + end + "]:");
        int result = 0;
        try {
            result = Integer.parseInt(sc.nextLine());
            if (result < start && result > end) {
                throw new HWTwoException ("Input number doesn't belong to the range [" + start + ", " + end + "]");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong. You Didn't enter any number. Lets try input integer number again:");
        } catch (NoSuchElementException e) {
            System.out.println("Hmm, something goes wrong. Lets try input integer again.");
        } catch (IllegalStateException e) {
            System.out.println("Something goes wrong with Scanner. Please, inform developer about problem.");
        }
        return result;
    }


// raw requirements, so I thought that task was just repeat method readNumber() 10 times ((
    static void main() {
        int count = 0;
        while (count <= 10) {
            readNumber(start, end);
            count++;
        }
    }
}
