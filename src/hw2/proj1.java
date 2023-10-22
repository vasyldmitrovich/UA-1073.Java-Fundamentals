package hw2;

import java.util.Scanner;
//Need rename and move to another package
class Main1 {
    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);//declaring user input

            System.out.println("Input radius of flower bed: ");
            int radius = scan.nextInt();

            double res = 2 * Math.PI * radius;//calculating
            System.out.println("The result is: " + res);
        }
    }
}