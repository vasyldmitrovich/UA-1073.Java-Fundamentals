package com.softserve.edu05.hw;

import static com.softserve.edu05.hw.App.SCANNER;

public class SumOfIntegers {
    public static int[] promptIntegers () {
        System.out.println("Enter two integers");
        int int1;
        int1 = SCANNER.nextInt();
        SCANNER.nextLine();
        int int2 = SCANNER.nextInt();
        SCANNER.nextLine();

        int[] integers = {int1, int2};
        return integers;
    }

    private static int getSum(int[] integers) {
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }

        return sum;
    }

    public static void findSum() {
        int sum = 0;
        boolean doMore = false;

        do {
            int[] integers = SumOfIntegers.promptIntegers();
            sum = SumOfIntegers.getSum(integers);

            System.out.println("Sum of these numbers is " + sum);
            System.out.println("Do you want me to repeat (Yes/No)");
            String answer = SCANNER.nextLine();
            doMore = answer.toLowerCase() == "yes";
        } while(doMore);
    }
}
