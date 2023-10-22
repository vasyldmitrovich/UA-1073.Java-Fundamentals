/*Input three float numbers and check: are they all belong to the range [-5, 5].*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scan = new Scanner(System.in);

        //User input
        System.out.println("Input first number: ");
        float num1 = scan.nextFloat();

        System.out.println("Input second number: ");
        float num2 = scan.nextFloat();

        System.out.println("Input third number: ");
        float num3 = scan.nextFloat();

        // Check if the first number is within the range [-5;5]
        if (num1 >= -5 && num1 <= 5) {
            System.out.println("First number belongs to the range [-5;5]");
        } else {
            System.out.println("First number doesn't belong to the range [-5;5]");
        }

        if (num2 >= -5 && num2 <= 5) {
            System.out.println("Second number belongs to the range [-5;5]");
        } else {
            System.out.println("Second number doesn't belong to the range [-5;5]");
        }
        

        if (num3 >= -5 && num3 <= 5) {
            System.out.println("Third number belongs to the range [-5;5]");
        } else {
            System.out.println("Third number doesn't belong to the range [-5;5]");
        }

        // Close the Scanner
        scan.close();
    }
}
