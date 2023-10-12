import java.util.Scanner;

public class integfive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        int secondPositivePosition = -1;
        int min = Integer.MAX_VALUE;
        int minPos = -1;
        int evenProduct = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Input integer: ");
            numbers[i] = scan.nextInt();

            if (numbers[i] > 0) {
                if (secondPositivePosition == -1) {
                    secondPositivePosition = i + 1;
                }
            }

            if (numbers[i] < min) {
                min = numbers[i];
                minPos = i + 1;
            }

            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                evenProduct *= numbers[i];
            }
        }

        System.out.println("Position of secont positive integer: " + (secondPositivePosition == -1 ? "not found" : secondPositivePosition));
        System.out.println("Minimal number and position: " + min + " (position " + minPos + ")");
        System.out.println("Product of all even numbers (except 0): " + evenProduct);
    }
}
