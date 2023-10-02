import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            int first = scanner.nextInt();

            System.out.print("Enter second number: ");
            int second = scanner.nextInt();

            int sum = first + second;
            System.out.println("Sum 2 numbers: " + sum);

            System.out.print("Want to relive the calculations?  + or -  ");
            choice = scanner.next().charAt(0);
        } while (Character.toLowerCase(choice) == '+');

        scanner.close();
    }
}

