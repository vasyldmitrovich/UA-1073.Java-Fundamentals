package com.softserve.edu04.pt;

public class Main {
    public static void main(String[] args) {
        Task1.searchOnlyOddNum();
        Task2.printDay();
        Task3.printInfoAboutCountry();

        Product[] products = {
                new Product("Apple", 12.5, 13),
                new Product("Lemon", 8.15, 23),
                new Product("Potato", 12.0, 50),
                new Product("Tomato", 26.0, 36)
        };

        Product mostExpensive = Product.searchMostExpensiveProduct(products);
        Product quantity = Product.searchProductQuantity(products);

        System.out.printf("The most expensive product is: %s.\n", mostExpensive);
        System.out.printf("The biggest quantity is: %s.\n", quantity);
    }
}
