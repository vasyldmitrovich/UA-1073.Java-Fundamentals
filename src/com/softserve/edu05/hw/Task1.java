import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);

        // Завдання 1: Обчислення кількості днів у місяці
        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            int days = daysInMonth[monthNumber - 1];
            System.out.println("In month there are " + days + " days.");
        } else {
            System.out.println("ERROR");
        }

        // Завдання 2: Обчислення суми або добутку елементів масиву
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sumFirst5 = 0;
        int productLast5 = 1;
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                if (numbers[i] > 0) {
                    sumFirst5 += numbers[i];
                }
            } else {
                productLast5 *= numbers[i];
            }
        }
        if (sumFirst5 > 0) {
            System.out.println("Sum of the first 5 positive numbers: " + sumFirst5);
        } else {
            System.out.println("Product of the last 5 numbers: " + productLast5);
        }

        // Завдання 3: Знаходження другого додатного числа, мінімуму та його позиції, та обчислення добутку парних чисел
        int[] numbers2 = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers2[i] = scanner.nextInt();
        }
        int secondPositive = -1;
        int min = numbers2[0];
        int minPosition = 0;
        int productOfEvens = 1;
        for (int i = 0; i < 5; i++) {
            if (numbers2[i] > 0) {
                if (secondPositive == -1) {
                    secondPositive = numbers2[i];
                }
            }
            if (numbers2[i] < min) {
                min = numbers2[i];
                minPosition = i;
            }
            if (numbers2[i] % 2 == 0 && numbers2[i] != 0) {
                productOfEvens *= numbers2[i];
            }
        }
        System.out.println("Second positive number: " + secondPositive);
        System.out.println("Minimum: " + min + " (position: " + minPosition + ")");
        System.out.println("Product of even numbers: " + productOfEvens);

        scanner.close();
    }
}
