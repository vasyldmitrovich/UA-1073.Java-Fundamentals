import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first integer: ");
        int num1 = scan.nextInt();

        System.out.println("Input second integer: ");
        int num2 = scan.nextInt();
        System.out.println("Input third integer: ");
        int num3 = scan.nextInt();
//finding maximum value
        int max = Math.max(Math.max(num1, num2), num3);
//finding minimum value
        int min = Math.min(Math.min(num1, num2), num3);
//output max and min value
        System.out.println("Maximum value is : " + max);
        System.out.println("Minimum value is : " + min);

    }
}
