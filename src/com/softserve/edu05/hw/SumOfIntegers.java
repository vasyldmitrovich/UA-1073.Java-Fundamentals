package com.softserve.edu05.hw;

import static com.softserve.edu05.hw.App.SCANNER;

public class SumOfIntegers {
    public static int[] promptIntegers () {
        System.out.println("Enter two integers");
        int int1 = App.getNumber();
        int int2 = App.getNumber();

        return new int[]{int1, int2};
    }

    private static int getSum(int[] integers) {
        int sum = 0;
        for (int integer : integers) {
            sum += integer;
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
