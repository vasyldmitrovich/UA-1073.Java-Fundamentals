package hw2;

import java.util.Scanner;

class Main3 {
    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);  // Create a Scanner object
            double c1, c2, c3;
            int t1, t2, t3;
            int inp;
            int total;
            System.out.println("Input cost cost per minute of first call: ");
            c1 = scan.nextDouble();
            System.out.println("Input cost cost per minute of second call: ");
            c2 = scan.nextDouble();
            System.out.println("Input cost cost per minute of third call: ");
            c3 = scan.nextDouble();

            System.out.println("Input duration of first call: ");
            t1 = scan.nextInt();
            System.out.println("Input duration of second call: ");
            t2 = scan.nextInt();
            System.out.println("Input duration of third call: ");
            t3 = scan.nextInt();

            System.out.println("Input 1 to show the calculation of each call, input 2 to show total cost, input 3 to show all data: ");
            inp = scan.nextInt();
            total = (int) ((c1 * t1) + (c2 * t2) + (c3 * t3));//calculation of total price
            if (inp == 1) {
                System.out.println("Price of first call = " + c1 * t1);
                System.out.println("Price of second call = " + c2 * t2);
                System.out.println("Price of second call = " + c3 * t3);
            } else if (inp == 2) {
                System.out.println("Total cost is: " + total);
            } else if (inp == 3) {
                System.out.println("Price of first call = " + c1 * t1);
                System.out.println("Price of second call = " + c2 * t2);
                System.out.println("Price of second call = " + c3 * t3);
                System.out.println("______________________________");
                System.out.println("Total cost is: " + total);
            } else {
                System.out.println("incorrect input!");
            }
        }
    }
}

