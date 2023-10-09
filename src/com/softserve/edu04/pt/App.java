package com.softserve.edu04.pt;

import java.util.Scanner;

public class App {//Very nice
    public static Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        // Task 1
        OddNumbers oddNumbers = new OddNumbers();
        OddNumbers.promptNumbers(oddNumbers);
        int oddAmount = oddNumbers.checkOddNumbers();
        System.out.println("There are " + oddAmount + " odd numbers");

        // Task 2
        System.out.println("Input day of week");
        String response = App.SCANNER.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(response.toUpperCase());

        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);

        // Task 3

        System.out.println("Input the country name: ");
        String countryName = App.SCANNER.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());

        System.out.println(country.name() + " belongs to " + country.continent);

        // Task 4
        Product product1 = new Product();
        Product.promptParameters(product1);

        Product product2 = new Product();
        Product.promptParameters(product2);

        Product product3 = new Product();
        Product.promptParameters(product3);

        Product product4 = new Product();
        Product.promptParameters(product4);

        Product[] products = new Product[] {product1, product2, product3, product4};
        Product mostExpensive = Product.findMostExpensive(products);
        System.out.println("The name of the most expensive product is " + mostExpensive.getName() +
                ". The quantity is " + mostExpensive.getQuantity());

        Product moreQuantity = Product.findMoreQuantity(products);
        System.out.println("The name of the product with biggest quantity is " + moreQuantity.getName() + ".");
    }
}
