package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task3 {
    public static void main (String[] args) throws IOException {
        Locale.setDefault(Locale.ROOT);

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please, enter info for the first country: cost and duration of the call");
            double cost1 = Double.parseDouble(scanner.readLine());
            double duration1 = Double.parseDouble(scanner.readLine());


            System.out.println("Please, enter info for the second country: cost and duration of the call");
            double cost2 = Double.parseDouble(scanner.readLine());
            double duration2 = Double.parseDouble(scanner.readLine());

            System.out.println("Please, enter info for the third country: cost and duration of the call");
            double cost3 = Double.parseDouble(scanner.readLine());
            double duration3 = Double.parseDouble(scanner.readLine());

            double totalCost = (cost1 * duration1) + (cost2 * duration2) + (cost3 * duration3);

            System.out.printf("Total cost for 3 calls is %.2f", totalCost);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
