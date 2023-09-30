package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.App.SCANNER;

public class OddNumbers {
    int[] numbers;
    final static int NUMBER_LENGTH = 3;

    public int checkOddNumbers() {
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 1) {
                odd++;
            }
        }

        return odd;
    }

    public static void promptNumbers(OddNumbers oddNumbers) {
        int[] numbers = new int[OddNumbers.NUMBER_LENGTH];

        System.out.println("Please enter " + OddNumbers.NUMBER_LENGTH + " numbers");

        for (int i = 0; i < OddNumbers.NUMBER_LENGTH; i++) {
            int number = SCANNER.nextInt();
            numbers[i] = number;
            SCANNER.nextLine();
        }

        oddNumbers.setNumbers(numbers);
    }

    public int[] getNumbers () {
        return numbers;
    }

    public void setNumbers (int[] numbers) {
        this.numbers = numbers;
    }
}
