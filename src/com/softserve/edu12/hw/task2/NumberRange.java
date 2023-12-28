import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberRange {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int previousNumber = start - 1;

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.print("Enter number a" + i + " (where a" + i + " > " + previousNumber + "): ");
                int number = readNumber(previousNumber, end);

                // Ensure the entered number is greater than the previous number
                if (number <= previousNumber) {
                    System.out.println("Number must be greater than the previous number.");
                    i--; // Decrement i to re-enter the same number index
                } else {
                    previousNumber = number;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                i--; // Decrement i to re-enter the same number index
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                i--; // Decrement i to re-enter the same number index
            }
        }
    }

    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
            if (number < start || number > end) {
                throw new Exception("Number is not within the specified range [" + start + "..." + end + "]");
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Input is not a valid integer.");
        } finally {
            scanner.nextLine(); // Clear the input buffer
        }
        return number;
    }
}
